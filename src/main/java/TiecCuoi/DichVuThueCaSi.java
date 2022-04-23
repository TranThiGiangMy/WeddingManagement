package TiecCuoi;

import java.util.Scanner;

public class DichVuThueCaSi extends DichVu{
    private String maCS;
    private String tenCS;
    private String queQuan;
    private int tuoi;
    private int soLuongBai;
    private static final Scanner scanner = new Scanner(System.in);

    public DichVuThueCaSi(String maDV, String tenDV, int giaDV, String maCS, String tenCS, String queQuan, int tuoi, int soLuongBai ){
        super(maDV, tenDV, giaDV);
        this.maCS = maCS;
        this.tenCS = tenCS;
        this.queQuan = queQuan;
        this.tuoi = tuoi;
        this.soLuongBai = soLuongBai;
    }

    public DichVuThueCaSi(){

    }

    @Override
    public void nhapDichVu() {
        super.nhapDichVu();
        System.out.printf("Nhập mã ca sĩ: ");
        this.maCS = scanner.nextLine();
        System.out.printf("Nhập tên ca si: ");
        this.tenCS = scanner.nextLine();
        System.out.printf("Nhập quê quán ca sĩ: ");
        this.queQuan = scanner.nextLine();
        System.out.printf("Nhập sổ tuổi ca sĩ: ");
        this.tuoi = scanner.nextInt();
        System.out.printf("Nhập số lượng bài hát yêu cầu ca sĩ: ");
        this.soLuongBai = scanner.nextInt();
    }

    @Override
    public void xuatDichVu() {
        super.xuatDichVu();
        System.out.printf("Mã xa sĩ là: %s\n", this.maCS);
        System.out.printf("Tên ca sĩ là: %s\n", this.tenCS);
        System.out.printf("Quê quán của ca sĩ là: %s\n", this.queQuan);
        System.out.printf("Số tuổi của ca sĩ: %s\n", this.tuoi);
        System.out.printf("Số lượng bào hát yêu cầu: %s\n", this.soLuongBai);
    }

    public String getMaCS() {
        return maCS;
    }

    public void setMaCS(String maCS) {
        this.maCS = maCS;
    }

    public String getTenCS() {
        return tenCS;
    }

    public void setTenCS(String tenCS) {
        this.tenCS = tenCS;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSoLuongBai() {
        return soLuongBai;
    }

    public void setSoLuongBai(int soLuongBai) {
        this.soLuongBai = soLuongBai;
    }
}
