import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    ArrayList<HangThucPham> ds;

    public DanhSach() {
        ds = new ArrayList<>();
    }

    public void them(HangThucPham htp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("lan nhap thu " + i + ": ");
            htp = new HangThucPham();
            htp.nhap();
            ds.add(htp);
        }
    }

    public void xuatDS() {
        System.out.format("%-26s %-26s %-26f %-26s %-26s %-26s", "ma hang", "ten hang", "don gia", "ngay san xuat",
                "ngay het han", "ghi chu");
        System.out.println(
                "===============================================================================================================================");
        for (HangThucPham htp : ds) {
            if (htp.hetHan()) {
                System.out.format("%-26s %-26s %-26.2f %-26s %-26s %-26s",
                        htp.getMahang(), htp.getTenhang(), htp.getDongia(), htp.getNsx(), htp.getNhh(), "Hang het han");
            } else
                System.out.format("%-26s %-26s %-26.2f %-26s %-26s",
                        htp.getMahang(), htp.getTenhang(), htp.getDongia(), htp.getNsx(), htp.getNhh());
        }
    }

    public void menu() {
        System.out.printf("MENU\n" +
                "0. Thoat\n" +
                "1. Nhap thong tin san pham\n" +
                "2. Xuat danh sach san pham\n");
    }
}