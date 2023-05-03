
package lophocphan;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Scanner;


public class SinhVienNhap {
    private int maSV;
    private String hoTen;
    private String diaChi;
    private String sDT;

    
    

    public SinhVienNhap(int maSV, String hoTen, String diaChi, String sDT) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sDT = sDT;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    @Override
    public String toString() {
        return "Mã sinh viên: " + maSV + "\n" +
                "Họ tên: " + hoTen + "\n" +
                "Địa chỉ: " + diaChi + "\n" +
                "Số điện thoại: " + sDT + "\n";
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        SinhVienNhap[] dsSinhVien = new SinhVienNhap[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            System.out.print("Mã sinh viên: ");
            int maSV = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ kí tự Enter
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Địa chỉ: ");
            String diaChi = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            String sDT = scanner.nextLine();

            dsSinhVien[i] = new SinhVienNhap(maSV, hoTen, diaChi, sDT);
        }

        
        Arrays.sort(dsSinhVien, Comparator.comparingInt(SinhVienNhap::getMaSV));

        // In danh sách sinh viên
        System.out.println("Danh sách sinh viên:");
        for (SinhVienNhap sv : dsSinhVien) {
            System.out.println(sv);
        }
    }
}


