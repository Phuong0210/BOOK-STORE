package Phuongbook;

import java.util.*;
import java.util.InputMismatchException;

public class NgonTinh extends Sach {

    public NgonTinh(int maSach, String tenSach, String tenTacgia, String nXB, int sL, float gia, String ngonNgu) {
        super(maSach, tenSach, tenTacgia, nXB, sL, gia, ngonNgu);

    }

    public NgonTinh() {
        super();

    }

    int sachNgonTinh;

    public void SachngonTinh() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sách ngôn tình: ");
        sachNgonTinh = sc.nextInt();
        System.out.println("Nhập thông tin sách ngôn tình:");
        for (int i = 0; i < sachNgonTinh; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            NgonTinh sach = new NgonTinh();
            sach.InputSach();
            Menu.arrNgonTinh.add(sach);
        }
    }

    public void showNT() {

        System.out.println("\t\t\t\t-----Sách ngôn tình-----");
        NgonTinh.Show();
        for (int i = 0; i < Menu.arrNgonTinh.size(); i++) {
            System.out.println(Menu.arrNgonTinh.get(i).toString());

        }

    }

    public void SapxepNT() {
        NgonTinh temp = Menu.arrNgonTinh.get(0);
        System.out.println("Sắp xếp giảm dần theo giá tiền: ");
        for (int i = 0; i < Menu.arrNgonTinh.size(); i++) {
            for (int j = 0; j < Menu.arrNgonTinh.size(); j++) {
                if (Menu.arrNgonTinh.get(i).getGia() > Menu.arrNgonTinh.get(j).getGia()) {
                    temp = Menu.arrNgonTinh.get(j);
                    Menu.arrNgonTinh.set(j, Menu.arrNgonTinh.get(i));
                    Menu.arrNgonTinh.set(i, temp);
                }
            }

        }
        showNT();

    }

    public void timkiem() {
        String tenSachCanTim;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên sách ");
        tenSachCanTim = scan.nextLine();

        for (int i = 0; i < Menu.arrNgonTinh.size(); i++) {
            if (Menu.arrNgonTinh.get(i).getTenSach().equals(tenSachCanTim)) {
                System.out.println("Có sách này nhé ");
                String header = String.format("\t%-8s%-15s%-25s%-12s%-20s", "Mã sách", "Tên sách", "Tên tác giả",
                        "Số lượng", "Giá");
                System.out.println(header);
                for (NgonTinh p : Menu.arrNgonTinh) {
                    String row = String.format("\t%-8d%-15s%-25s%-12d%-20.2f", p.getMaSach(), p.getTenSach(),
                            p.getTenTacgia(), p.getSL(), p.getGia());
                    System.out.println(row);
                    count++;
                    break;
                }
            }
        }

        if (count == 0) {
            System.out.println("Rất tiếc, cửa hàng không bán sách có tên " + tenSachCanTim + " ạ.");

        }
    }

    public void timTacgia() {
        String ten;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập tên tác giả ");
        ten = scan.nextLine();

        for (int i = 0; i < Menu.arrNgonTinh.size(); i++) {
            if (Menu.arrNgonTinh.get(i).getTenTacgia().equals(ten)) {
                System.out.println("Có sách của Tác giả này nhé ");
                String header = String.format("%-8s  %-15s%-25s%-12s%-20s%-15s", "Mã sách", "Tên sách", "Tên tác giả",
                        "Số lượng", "Giá", "Ngôn ngữ");
                System.out.println(header);
                for (NgonTinh p : Menu.arrNgonTinh) {
                    String row = String.format("%-8d %-15s%-25s%-12d%-20.2f%-15s", p.getMaSach(), p.getTenSach(),
                            p.getTenTacgia(), p.getSL(), p.getGia(), p.getNgonNgu());
                    System.out.println(row);
                    count++;
                    break;
                }
            }
        }

        if (count == 0) {
            System.out.println("Rất tiếc,cửa hàng không bán sách của tác giả này:" + ten);

        }
    }

    public void xoaSach() {
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Nhập mã: ");
            Integer id = scn.nextInt();
            NgonTinh pr = null;

            for (NgonTinh p : Menu.arrNgonTinh) {
                if (p.getMaSach() == id) {
                    pr = p;
                    break;
                }
            }

            if (pr == null) {
                System.out.println("Mã sách không tồn tại. Xin vui lòng nhập lại!");
            }

            for (int i = 0; i < Menu.arrNgonTinh.size(); i++) {
                if (id.equals(Menu.arrNgonTinh.get(i).getMaSach())) {

                    Menu.arrNgonTinh.remove(i);

                }
            }

        } catch (InputMismatchException ei) {
            System.out.println("Bạn đã nhập sai giá trị, xin vui lòng nhập lại!");

        }
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Bạn muốn chỉnh sửa thông tin cho sách(Hãy nhập mã sách): ");
        int e = sc.nextInt();
        for (NgonTinh em : Menu.arrNgonTinh) {
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
        System.out.println("        ---------------------------------------\n");

    }

}
