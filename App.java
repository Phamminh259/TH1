import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        HangThucPham htp = new HangThucPham();
        DanhSach ds = new DanhSach();
        Scanner sc = new Scanner (System.in);
        int luachon = 0;
        do{
            ds.menu();
            System.out.println("nhap lua chon: ");
            luachon = sc.nextInt();
            if(luachon ==1){
                ds.them(htp);
            }else if(luachon==2){
                ds.xuatDS();
            }
        }while (luachon!=0);
    }
}