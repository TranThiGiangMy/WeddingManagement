package TiecCuoi;

import java.util.Scanner;

import static java.lang.String.format;

public class SanhCuoi {
    private String maSanh;
    private String tenSanh;
    private String viTriSanh;
    private int sucChua;
    private double giaThue;
    private static final Scanner scanner = new Scanner(System.in);

    public static int dem = 0;
    {
        dem++;
        maSanh = "S" + String.format("%03d", getDem());
    }

    public SanhCuoi(String tenSanh, String viTriSanh, int sucChua, double giaThue){
        this.tenSanh = tenSanh;
        this.viTriSanh = viTriSanh;
        this.sucChua = sucChua;
        this.giaThue = giaThue;
        
    }

    public SanhCuoi(){}

    public void nhapSanh(){
        System.out.printf("Nhap ten sanh: ");
        this.tenSanh = scanner.nextLine();
        System.out.printf("Vi tri sanh: ");
        this.viTriSanh = scanner.nextLine();
        System.out.printf("Suc chua cua sanh: ");
        this.sucChua = scanner.nextInt();
        System.out.printf("Gia thue cua sanh: ");
        this.giaThue = scanner.nextDouble();
    }

    public void xuatSanh(){
        System.out.printf("Mã Sảnh: %s\n", this.maSanh);
        System.out.printf("Tên Sảnh: %s\n", this.tenSanh);
        System.out.printf("Vị Trí Sảnh: %s\n", this.viTriSanh);
        System.out.printf("Sức chứa: %d\n", this.sucChua);
        System.out.printf("Gia thue sanh: %s\n", this.giaThue);
//        System.out.printf("Ma sanh:%d\nTen sanh:%d\nVi tri sanh:%d\nSuc chua:%d\nGia thue:%d",
//                this.maSanh, this.tenSanh, this.viTriSanh,this.sucChua,this.giaThue);
    }



//    public SanhCuoi(String maSanh) {
//
//    }
    public static int getDem(){
        return dem;
    }




    public String getMaSanh() {
        return maSanh;
    }

    public void setMaSanh(String maSanh) {
        this.maSanh = maSanh;
    }

    public String getTenSanh() {
        return tenSanh;
    }

    public void setTenSanh(String tenSanh) {
        this.tenSanh = tenSanh;
    }

    public String getViTriSanh() {
        return viTriSanh;
    }

    public void setViTriSanh(String viTriSanh) {
        this.viTriSanh = viTriSanh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public double getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(double giaThue) {
        this.giaThue = giaThue;
    }
}
