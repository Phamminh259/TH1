import java.time.LocalDate;
import java.util.Scanner;

public class HangThucPham {
    private String mahang, tenhang = "xxx";
    private double dongia;
    private LocalDate nsx = LocalDate.now(), nhh = nsx;

    public HangThucPham() {

    }

    public HangThucPham(String mahang, String tenhang, double dongia, LocalDate nsx, LocalDate nhh) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.dongia = dongia;
        this.nsx = nsx;
        this.nhh = nhh;
    }

    public String getMahang() {
        return this.mahang;
    }

    public void setMahang(String mahang) throws Exception {
        if (!mahang.trim().equals(""))
            this.mahang = mahang;
        else
            throw new Exception("Loi: ma hang rong!");
    }

    public String getTenhang() {
        return this.tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public double getDongia() {
        return this.dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public LocalDate getNsx() {
        return this.nsx;
    }

    public void setNsx(LocalDate nsx) {
        this.nsx = nsx;
    }

    public LocalDate getNhh() {
        return this.nhh;
    }

    public void setNhh(LocalDate nhh) {
        this.nhh = nhh;
    }

    @Override
    public String toString() {
        return "{" +
                " mahang='" + getMahang() + "'" +
                ", tenhang='" + getTenhang() + "'" +
                ", dongia='" + getDongia() + "'" +
                ", nsx='" + getNsx() + "'" +
                ", nhh='" + getNhh() + "'" +
                "}";
    }

    public void nhap (){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma hang:");
        mahang=sc.nextLine();
        System.out.println("nhap ten hang:");
        tenhang=sc.nextLine();
        System.out.println("nhap don gia:");
        do {
            dongia = sc.nextDouble();
            if(dongia < 0){
                System.out.println("khong hop le! nhap lai");
            }
        }while (dongia<0);
        System.out.println("nhap ma hang:");
        mahang=sc.nextLine();
        System.out.println("nhap ngay san xuat:");
        int ngaysx = sc.nextInt();
        System.out.println("nhap thang san xuat:");
        int thangsx = sc.nextInt();
        System.out.println("nhap nam san xuat:");
        int namsx = sc.nextInt();
        nsx = LocalDate.of(ngaysx,thangsx,namsx);
        System.out.println("nhap ngay het han:");
        int ngayhh = sc.nextInt();
        System.out.println("nhap thang het han:");
        int thanghh = sc.nextInt();
        System.out.println("nhap nam het han:");
        int namhh = sc.nextInt();
        nhh = LocalDate.of(ngayhh,thanghh,namhh);
    }

    public boolean hetHan() {
        return nhh.isBefore(LocalDate.now()) ? true : false;
    }
}