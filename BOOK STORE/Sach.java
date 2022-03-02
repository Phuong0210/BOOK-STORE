package Phuongbook;

import java.util.*;

public class Sach {

    private int maSach;
    private String tenSach;
    private String tenTacgia;
    private String NXB;
    private int SL;
    private float gia;
    private String ngonNgu;

    public Sach(int maSach, String tenSach, String tenTacgia, String nXB, int sL, float gia, String ngonNgu) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacgia = tenTacgia;
        this.NXB = nXB;
        this.SL = sL;
        this.gia = gia;
        this.ngonNgu = ngonNgu;
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacgia() {
        return tenTacgia;
    }

    public void setTenTacgia(String tenTacgia) {
        this.tenTacgia = tenTacgia;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String nXB) {
        this.NXB = nXB;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int sL) {
        this.SL = sL;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public Sach() {

    }

    public void InputSach() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        maSach = (Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập tên sách: ");
        tenSach = sc.nextLine();
        System.out.println("Nhập tên tác giả: ");
        tenTacgia = sc.nextLine();
        System.out.println("Nhập NXB sách: ");
        NXB = sc.nextLine();
        System.out.println("Nhập SL sách: ");
        SL = (Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập giá sách: ");
        gia = (Float.parseFloat(sc.nextLine()));
        System.out.println("Nhập ngôn ngữ: ");
        ngonNgu = sc.nextLine();
    }

    // public void ShowSach() {
    // System.out.println("Mã sách: " + maSach + " Tên sách: " + tenSach + "Tác giả:
    // " + tenTacgia + " NXB: " + NXB
    // + " SL: " + SL + " Gía: " + gia);
    // @Override
    // public String toString() {
    // return "Mã sách: " + this.maSach + ",Tên sách: " + this.tenSach + ", tên nhà
    // xuất bản: " + this.NXB + ", giá: "
    // + this.gia + ", số lượng: " + this.SL + " ";

    @Override
    public String toString() {
        return String.format("%-10d%-20s%-13s%-15s%-10d%-16.2f%-18.2f%-15s", maSach, tenSach, tenTacgia, NXB, SL, gia,
                SL * gia, ngonNgu);
    }

    public static void Show() {
        System.out.printf("%-10s%-20s%-13s%-15s%-10s%-16s%-18s%-15s\n", "Mã sách", "Tên sách", "Tên tác giả", "NXB",
                "Số lượng", "Giá", "Thành tiền", "Ngôn ngữ ");
    }

}
