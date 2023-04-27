package vehicle;

import java.util.Scanner;

public class Vehicle {

    private String chuxe;
    private String loaixe;
    private double dungtich;
    private double trigia;
    private double thuephainop;

    public Vehicle(String chuxe, String loaixe, double dungtich, double trigia ) {
        this.chuxe = chuxe;
        this.loaixe = loaixe;
        this.dungtich = dungtich;
        this.trigia = trigia;
        tinhthue();
    }

    
    

    private void tinhthue() {
        if (dungtich < 100) {
            thuephainop = trigia * 0.01;

            if (dungtich >= 100 && dungtich <= 200) {
                thuephainop = trigia * 0.03;
            }
        } else {
            thuephainop = trigia * 0.05;
        }
        System.out.println("thue phai nop la" + thuephainop);
    }

    public String getchuxe() {
        return chuxe;
    }

    public String getloaixe() {
        return loaixe;
    }

    public double getdungtich() {
        return dungtich;
    }

    public double gettrigia() {
        return trigia;
    }

    public double gethuephainop() {
        return thuephainop;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle[] x = new Vehicle[3];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Nhập thông tin xe" + (i + 1) + ":");
            System.out.print("chủ xe:");
            String chuxe = sc.nextLine();
            System.out.print("Loại xe: ");
            String loaixe = sc.nextLine();
            System.out.print("Dung tích : ");
            double dungtich = sc.nextDouble();
            System.out.print("trị giá: ");
            double trigia = sc.nextDouble();
            sc.nextLine();

            x[i] = new Vehicle(chuxe, loaixe, dungtich, trigia);
        }
        System.out.println("Bảng kê khai tiền thuế của các xe ");
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", "chủ xe", "loại xe", "dung tích ", "trị giá", "thue phai nop");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|\n", x[i].getchuxe(), x[i].getloaixe(), x[i].getdungtich(), x[i].gettrigia(), x[i].gethuephainop());

        }

    }

}
