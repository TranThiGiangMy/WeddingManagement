package TiecCuoi;

import java.util.Scanner;

public class DichVuKaraoke extends DichVu{
    private static final Scanner scanner = new Scanner(System.in);
    private String thoiGianThue;

    public DichVuKaraoke(String maDV, String tenDV, double giaDV,String thoiGianThue){
        super(maDV, tenDV, giaDV);
        this.thoiGianThue = thoiGianThue;
    }

    public DichVuKaraoke(){

    }

    @Override
    public void nhapDichVu() {
        super.nhapDichVu();
        System.out.printf("Nhập thời gian sử dụng dịch vụ: ");
        this.setThoiGianThue(scanner.nextLine());
    }


    @Override
    public void xuatDichVu() {
        super.xuatDichVu();
        System.out.printf("Thời gian sử dụng dịch vụ là: %s", this.getThoiGianThue());
    }

    public String getThoiGianThue() {
        return thoiGianThue;
    }

    public void setThoiGianThue(String thoiGianThue) {
        this.thoiGianThue = thoiGianThue;
    }
}
