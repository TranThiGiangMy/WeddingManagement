package tieccuoi;

import java.util.Scanner;

public class SanhCuoi{
    private static String tenSanh;
    private String idSanh;
    private static int dem = 0;
    private String viTri;
    private int sucChua;
    private static double giaThue = 1000;
    final Scanner s = new Scanner(System.in);

    {
        idSanh = "S" + String.format("%05d", ++dem);
    }

    public SanhCuoi(String tenS, String vt, int nguoiChua){
        this.setTenSanh(tenS);
        this.viTri = vt;
        this.sucChua = nguoiChua;
    }

    public SanhCuoi(){
    }



    public void nhapSanh(){
        System.out.printf("Nhập tên sảnh: ");
        this.setTenSanh(s.nextLine());
        System.out.printf("Nhập vị trí sảnh: ");
        this.viTri = s.nextLine();
        System.out.printf("Nhập sức chứa: ");
        this.sucChua = s.nextInt();
    }

    public void xuatSanh(){
        System.out.printf("Mã Sảnh: %s\n", this.idSanh);
        System.out.printf("Tên Sảnh: %s\n", this.getTenSanh());
        System.out.printf("Vị Trí Sảnh: %s\n", this.viTri);
        System.out.printf("Sức chứa: %d\n", this.sucChua);
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        SanhCuoi.dem = dem;
    }

    public static String getTenSanh() {
        return tenSanh;
    }

    public static void setTenSanh(String tenSanh) {
        SanhCuoi.tenSanh = tenSanh;
    }

    public String getIdSanh() {
        return idSanh;
    }

    public void setIdSanh(String idSanh) {
        this.idSanh = idSanh;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public static double getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(double giaThue) {
        this.giaThue = giaThue;
    }
}
