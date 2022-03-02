package Phuongbook;

import java.util.*;

import phuong.Hoadon;

public class Menu {
    public static ArrayList<NgonTinh> arrNgonTinh = new ArrayList<NgonTinh>();
    public static ArrayList<ThieuNhi> arrThieuNhi = new ArrayList<ThieuNhi>();

    public static void main(String[] args) {

        NgonTinh y = new NgonTinh(101, "I love you", "Hoai An", "Mong Tuyet", 7, 35000f, "Anh");
        Menu.arrNgonTinh.add(y);
        NgonTinh y1 = new NgonTinh(102, "Toi yeu em", "Hoai An", "Mong Tuyet", 2, 25000f, "Viet Nam");
        Menu.arrNgonTinh.add(y1);
        NgonTinh y2 = new NgonTinh(103, "Bad boy", "Ki Nhi", "Dinh ti", 3, 55000f, "Trung Quoc");
        Menu.arrNgonTinh.add(y2);
        NgonTinh y3 = new NgonTinh(104, "Anh chang xau tinh", "Ki Nhi", "Dinh ti", 2, 45000f, "Viet Nam");
        Menu.arrNgonTinh.add(y3);
        ThieuNhi b = new ThieuNhi(111, "Loi cam on", "Nhieu tac gia", "Kim Dong", 4, 15000f, "Viet Nam");
        Menu.arrThieuNhi.add(b);
        ThieuNhi b1 = new ThieuNhi(112, "Thank you", "Nhieu tac gia", "Kim Dong", 3, 25000f, "Anh");
        Menu.arrThieuNhi.add(b1);
        ThieuNhi b2 = new ThieuNhi(113, "Cau ban ti hon", "Ha Hai", "Kim Dong", 6, 27000f, "Viet Nam");
        Menu.arrThieuNhi.add(b2);
        ThieuNhi b3 = new ThieuNhi(114, "Tiny boy", "Ha Hai", "Kim Dong", 1, 28000f, "Anh");
        Menu.arrThieuNhi.add(b3);
        ThieuNhi b4 = new ThieuNhi(115, "Dong ho ma thuat", "Tuyet Huong", "Kim Dong", 5, 34000.2f, "Viet Nam");
        Menu.arrThieuNhi.add(b4);
        ThieuNhi b5 = new ThieuNhi(116, "The magic clock", "Tuyet Huong", "Kim Dong", 2, 36000.2f, "Anh");
        Menu.arrThieuNhi.add(b5);
        NgonTinh arrNgonTinh = new NgonTinh();
        ThieuNhi arrThieuNhi = new ThieuNhi();

        Scanner sc = new Scanner(System.in);

        int choose;
        boolean chon = true;
        do {
            showMenu();
            System.out.println("Mời bạn chọn số: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    int chon1;
                    System.out.println("\t\t-----NHẬP THÔNG TIN CHO SÁCH-----");
                    Show1();
                    System.out.println("Mời bạn chọn số: ");
                    chon1 = Integer.parseInt(sc.nextLine());
                    switch (chon1) {
                        case 1:
                            arrNgonTinh.SachngonTinh();
                            break;
                        case 2:
                            arrThieuNhi.SachThieunhi();
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    int chon2;
                    System.out.println("\t\t-----HIỆN THỊ SÁCH-----");
                    Show1();
                    System.out.println("Mời bạn chọn số: ");
                    chon2 = Integer.parseInt(sc.nextLine());
                    switch (chon2) {
                        case 1:
                            arrNgonTinh.showNT();

                            break;
                        case 2:
                            arrThieuNhi.showTN();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    int chon3;
                    System.out.println("\t\t-----SẮP XẾP THEO GIÁ TIỀN-----");
                    Show1();
                    System.out.println("Mời bạn chọn số: ");
                    chon3 = Integer.parseInt(sc.nextLine());
                    switch (chon3) {
                        case 1:
                            arrNgonTinh.SapxepNT();
                            break;
                        case 2:
                            arrThieuNhi.SapxepTN();
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    int chon4;
                    System.out.println("\t\t-----TÌM KIẾM THEO TÊN SÁCH-----");
                    Show1();
                    System.out.println("Mời bạn chọn số: ");
                    chon4 = Integer.parseInt(sc.nextLine());
                    switch (chon4) {
                        case 1:
                            arrNgonTinh.timkiem();
                            break;
                        case 2:
                            arrThieuNhi.Tim();
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    int chon5;
                    System.out.println("\t\t-----TÌM KIẾM THEO TÊN TÁC GIẢ-----");
                    Show1();
                    System.out.println("Mời bạn chọn số: ");
                    chon5 = Integer.parseInt(sc.nextLine());
                    switch (chon5) {
                        case 1:
                            arrNgonTinh.timTacgia();
                            break;
                        case 2:
                            arrThieuNhi.TimTacGia();
                            break;
                        default:
                            break;
                    }
                    break;

                case 6:
                    int chon6;
                    System.out.println("\t\t-----XÓA THÔNG TIN SÁCH THEO ID-----");
                    Show1();
                    System.out.println("Mời bạn chọn số: ");
                    chon6 = Integer.parseInt(sc.nextLine());
                    switch (chon6) {
                        case 1:
                            arrNgonTinh.xoaSach();
                            break;
                        case 2:
                            arrThieuNhi.XoaSach();
                            break;
                        default:
                            break;
                    }
                    break;

                case 7:
                    int chon7;
                    System.out.println("\\t\t-----CHỈNH SỬA THÔNG TIN SÁCH-----");
                    Show1();
                    System.out.println("Mời bạn chọn số: ");
                    chon7 = Integer.parseInt(sc.nextLine());
                    switch (chon7) {
                        case 1:
                            arrNgonTinh.update();
                            break;
                        case 2:
                            arrThieuNhi.Update();
                            break;
                        default:
                            break;
                    }
                    break;
                case 8:
                    System.out.println("Thoát! ");
                    System.out.println("Xin chào và hẹn gặp lại");
                    chon = false;
                    break;

                default:
                    System.out.println("Mời bạn nhập lại nào: ");
                    break;

            }
        } while (chon);

    }

    static void showMenu() {
        System.out.println("\t--------------------------------------------------------");
        System.out.println("\t|\t\t\tMENU                            |");
        System.out.println("\t| 1. Nhập thêm sách.                                    |");
        System.out.println("\t| 2. Hiện thị sách.                                     |");
        System.out.println("\t| 3. Sắp xếp thông tin theo giá.                        |");
        System.out.println("\t| 4. Tìm kiếm theo tên sách.                            |");
        System.out.println("\t| 5. Tim kiếm theo tên tác giả.                         |");
        System.out.println("\t| 6. Xóa Sách theo ID                                   |");
        System.out.println("\t| 7. Chỉnh sửa thông tin sách.                          |");
        System.out.println("\t| 8. Thoát!                                             |");
        System.out.println("\t--------------------------------------------------------");

    }

    public static void Show1() {
        System.out.println("\t\t---------------------------------");
        System.out.println("\t\t|Bạn muốn chọn thể loại nào:     |");
        System.out.println("\t\t|   1.Sách ngôn tình             |");
        System.out.println("\t\t|   2.Sách thiếu nhi             |");
        System.out.println("\t\t---------------------------------");
    }

}
