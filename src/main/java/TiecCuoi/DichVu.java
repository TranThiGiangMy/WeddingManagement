package TiecCuoi;

import java.util.Scanner;

public class DichVu {
    private static final Scanner scanner = new Scanner(System.in);
    private String maDV;
    private String tenDV;
    private int giaDV;

    public DichVu(String maDV, String tenDV, int giaDV){
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.giaDV = giaDV;
    }
    public DichVu(){}

    public void nhapDichVu(){
        System.out.printf("Nhập mã dịch vụ: ");
        this.maDV = scanner.nextLine();
        System.out.printf("Nhập tên dịch vụ: ");
        this.tenDV = scanner.nextLine();
        System.out.printf("Nhập giá dịch vu: ");
        this.giaDV = scanner.nextInt();
    }

    public void xuatDichVu(){
        System.out.printf("Mã dịch vụ là: %s\n", this.maDV);
        System.out.printf("Tên dịch vụ là: %s\n", this.tenDV);
        System.out.printf("Giá dịch vụ : %s\n", this.giaDV);
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public int getGiaDV() {
        return giaDV;
    }

    public void setGiaDV(int giaDV) {
        this.giaDV = giaDV;
    }
}
