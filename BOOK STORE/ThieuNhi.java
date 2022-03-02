package Phuongbook;

import java.util.*;

public class ThieuNhi extends Sach {

    public ThieuNhi(int maSach, String tenSach, String tenTacgia, String nXB, int sL, float gia, String ngonNgu) {
        super(maSach, tenSach, tenTacgia, nXB, sL, gia, ngonNgu);
    }

    public ThieuNhi() {
        super();

    }

    int sachThieuNhi;

    public void SachThieunhi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sách thiếu nhi: ");
        sachThieuNhi = sc.nextInt();
        System.out.println("Nhập thông tin sách thiếu nhi:");
        for (int i = 0; i < sachThieuNhi; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            ThieuNhi sachTn = new ThieuNhi();
            sachTn.InputSach();
            Menu.arrThieuNhi.add(sachTn);

        }

    }

    public void showTN() {
        System.out.println("\t\t\t\t-----Sách thiếu nhi-----");
        ThieuNhi.Show();
        for (int i = 0; i < Menu.arrThieuNhi.size(); i++) {
            System.out.println(Menu.arrThieuNhi.get(i).toString());
        }

    }

    public void SapxepTN() {
        ThieuNhi tam = Menu.arrThieuNhi.get(0);
        System.out.println("Sắp xếp tăng dần theo giá tiền: ");
        for (int i = 0; i < Menu.arrThieuNhi.size(); i++) {
            for (int j = 0; j < Menu.arrThieuNhi.size(); j++) {
                if (Menu.arrThieuNhi.get(i).getGia() < Menu.arrThieuNhi.get(j).getGia()) {
                    tam = Menu.arrThieuNhi.get(j);
                    Menu.arrThieuNhi.set(j, Menu.arrThieuNhi.get(i));
                    Menu.arrThieuNhi.set(i, tam);
                }
            }

        }
        showTN();
    }

    public void Tim() {
        String Tensach;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên sách ");
        Tensach = scan.nextLine();

        for (int i = 0; i < Menu.arrThieuNhi.size(); i++) {
            if (Menu.arrThieuNhi.get(i).getTenSach().equals(Tensach)) {
                String header = String.format("\t%-8s  %-15s%-25s%-12s%-20s", "Mã sách", "Tên sách", "Tên tác giả",
                        "Số lượng", "Giá");
                System.out.println(header);
                for (ThieuNhi p : Menu.arrThieuNhi) {
                    String row = String.format("\t%-8d %-15s%-25s%-12d%-20.2f", p.getMaSach(), p.getTenSach(),
                            p.getTenTacgia(), p.getSL(), p.getGia());
                    System.out.println(row);
                    count++;
                    break;
                }
            }
        }

        if (count == 0) {
            System.out.println("Rất tiếc không có quyển sách tên " + Tensach + " ạ!");

        }

    }

    public void TimTacGia() {
        String ten;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên tác giả: ");
        ten = scan.nextLine();

        for (int i = 0; i < Menu.arrThieuNhi.size(); i++) {
            if (Menu.arrThieuNhi.get(i).getTenSach().equals(ten)) {
                System.out.println("Có sách của  tác giả  này nhé ");
                String header = String.format("%-8s  %-15s%-25s%-12s%-20s", "Mã sách", "Tên sách", "Tên tác giả",
                        "Số lượng", "Giá");
                System.out.println(header);
                for (ThieuNhi p : Menu.arrThieuNhi) {
                    String row = String.format("%-8d %-15s%-25s%-12d%-20.2f", p.getMaSach(), p.getTenSach(),
                            p.getTenTacgia(), p.getSL(), p.getGia());
                    System.out.println(row);
                    count++;
                    break;
                }
            }
        }

        if (count == 0) {
            System.out.println("Rất tiếc, cửa hàng không bán sách của tác giả: " + ten);

        }

    }

    public void XoaSach() {
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Nhập mã: ");
            Integer id = scn.nextInt();
            ThieuNhi pr = null;

            for (ThieuNhi p : Menu.arrThieuNhi) {
                if (p.getMaSach() == id) {
                    pr = p;
                    break;
                }
            }

            if (pr == null) {
                System.out.println("Mã sách không tồn tại. Xin vui lòng nhập lại!");
            }

            for (int i = 0; i < Menu.arrThieuNhi.size(); i++) {
                if (id.equals(Menu.arrThieuNhi.get(i).getMaSach())) {

                    Menu.arrThieuNhi.remove(i);

                }
            }

        } catch (InputMismatchException ei) {
            System.out.println("Bạn đã nhập sai giá trị, xin vui lòng nhập lại!");

        }
    }

    public void Update() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Bạn muốn chỉnh sửa thông tin cho sách (Hãy nhập mã sách): ");
        int e = sc.nextInt();
        for (ThieuNhi em : Menu.arrThieuNhi) {
            if (em.getMaSach() == e) {
                updateMenu();
                int luachon = sc.nextInt();
                sc.nextLine();
                if (luachon == 1) {
                    System.out.println("Nhập tên sách mới: ");
                    em.setTenSach(sc.nextLine());
                } else if (luachon == 2) {
                    System.out.println("Nhập mã sách mới: ");
                    em.setMaSach(sc.nextInt());
                } else if (luachon == 3) {
                    System.out.println("Nhập giá tiền mới: ");
                    em.setGia(sc.nextFloat());
                } else
                    System.out.println("Lựa chọn không phù hợp");
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Mã ID không hợp lệ!!!");
        }

    }

    public void updateMenu() {
        System.out.println("\n      -------BẠN MUỐN CẬP NHẬT CÁI GÌ?-------");
        System.out.println("                  1.Tên sách");
        System.out.println("                  2.Mã sách");
        System.out.println("                  3.Giá tiền");
        System.out.println("        --------------------------------------\n");

    }

}
