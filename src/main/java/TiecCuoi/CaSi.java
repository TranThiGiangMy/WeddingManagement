package TiecCuoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CaSi {
    private static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
    Scanner scanner = new Scanner(System.in);
    private String tenCS;
    private Date ngaySinh;
    private String queQuan;
    private double soDT;


    public CaSi(String tenCS, Date ns, String queQuan, double soDT){
        this.tenCS = tenCS;
        this.ngaySinh = ns;
        this.queQuan = queQuan;
        this.soDT = soDT;
    }

    public CaSi(String tenCS, String ns, String queQuan, double soDT) throws ParseException {
        this(tenCS,F.parse(ns), queQuan, soDT);
    }

    public CaSi(){}


    public void xuat(){
        System.out.printf("Ten ca si: %d\nNgay sinh: %d\nQue quan: %d\nSo dien thoai: %d", this.tenCS, F.format(this.ngaySinh), this.queQuan, this.soDT);
    }

    public void nhap() throws ParseException {
        System.out.printf("Nhap ten ca si: ");
        this.tenCS = scanner.nextLine();
        System.out.printf("Nhap ngay sinh: ");
        this.ngaySinh = F.parse(scanner.nextLine());
        System.out.printf("Nhap que quan: ");
        this.queQuan = scanner.nextLine();
        System.out.printf("Nhap so dien thoai");
        this.soDT = scanner.nextDouble();
    }



    public String getTenCS() {
        return tenCS;
    }

    public void setTenCS(String tenCS) {
        this.tenCS = tenCS;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public double getSoDT() {
        return soDT;
    }

    public void setSoDT(double soDT) {
        this.soDT = soDT;
    }
}
