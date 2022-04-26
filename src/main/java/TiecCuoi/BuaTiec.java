package TiecCuoi;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BuaTiec {
    String list;
    String sanh;
    private String tenBuaTiec;
    private double donGiaThueSanh = 1;
    private double donGiaThueThueThoiDiem = 1;
    private Date ngayThue;
    private ThoiDiemThue thoiDiemThue;
    private QuanLySanhCuoi Sc = new QuanLySanhCuoi();
    private QuanLyThucPham menu = new QuanLyThucPham();
    private QuanLyDichVu dichVu = new QuanLyDichVu();
    private final Scanner s = new Scanner(System.in);
    private static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy", Locale. ENGLISH);
    private List<SanhCuoi> sanhCuoi = new ArrayList<SanhCuoi>();
    private List<ThucPham> thucAn = new ArrayList<>();
    private List<ThucPham> thucUong = new ArrayList<>();
    private List<DichVu> dv = new ArrayList<>();

    public BuaTiec(String tenBuaTiec, String ngayThue, ThoiDiemThue thoiDiemThue, QuanLySanhCuoi SanhCuoi, QuanLyThucPham menu, QuanLyDichVu dichVu) throws ParseException {
        this.setTenBuaTiec(tenBuaTiec);
        this.setNgayThue(getF().parse(ngayThue));
        this.setThoiDiemThue(thoiDiemThue);
        this.setSanhCuoi(SanhCuoi);
        this.setMenu(menu);
        this.setDichVu(dichVu);
    }

    public BuaTiec(){

    }

    public static SimpleDateFormat getF() {
        return F;
    }

    public double donGiaThueSanh() throws FileNotFoundException {
//        Sc.docDsSanh();;
        double gia = 0;
        double temp;
        if (SanhCuoi.getTenSanh().contains("thuong"))
            gia = SanhCuoi.getGiaThue() * 1;
        else if (SanhCuoi.getTenSanh().contains("VIP"))
            gia = SanhCuoi.getGiaThue() * 1.5;
        else if (SanhCuoi.getTenSanh().contains("deluxe"))
            gia = SanhCuoi.getGiaThue() * 2;
        else
            gia = SanhCuoi.getGiaThue() * 1.25;


        return gia;
    }

    public double donGiaThueTheoThoiDiem(){
        double gia = 0;
        switch (this.thoiDiemThue) {
            case SANG_THUONG:
                gia = SanhCuoi.getGiaThue() * 1.1;
            case CHIEU_THUONG:
                gia = SanhCuoi.getGiaThue() * 1.2;
            case TOI_THUONG:
                gia = SanhCuoi.getGiaThue() * 1.3;
            case SANG_CUOI_TUAN:
                gia = SanhCuoi.getGiaThue() * 1.5;
            case CHIEU_CUOI_TUAN:
                gia = SanhCuoi.getGiaThue() * 1.75;
            case TOI_CUOI_TUAN:
                gia = SanhCuoi.getGiaThue() *2;
        }

        return gia;

    }
//
//    public void xuatThoiDiemThue(){
//        for(ThoiDiemThue thoiDiemThue: ThoiDiemThue.values());
//        System.out.println(thoiDiemThue);
//    }

    public void nhapSanhBuaTiec() throws FileNotFoundException {
        System.out.println("Danh sách sảnh");
        Sc.docDsSanh();
        Sc.xuatSanh();
    }


    public void xuatSanhBuaTiec(){
        SanhCuoi kq = new SanhCuoi();
        Sc.timKiem(sanh);
        kq.xuatSanh();
    }

    public void nhapDsThucAnBuaTiec() throws FileNotFoundException {
        System.out.println("Danh sách thức ăn");
        menu.docDsThucAn();
        menu.xuatThucPham();

        System.out.println("Thức ăn bạn chọn: ");
        this.list = s.nextLine();
    }

    public void xuatThucAnBuaTiec(){
        System.out.printf("Danh sách thức ăn bạn chọn: ");
        ThucAn kq = new ThucAn();
        menu.timKiem(list);
        kq.xuatTp();
    }

    public void nhapDsThucUong() throws FileNotFoundException {
        System.out.println("Danh sách thức uống");
        menu.docDsThucUong();
        menu.xuatThucPham();

        System.out.println("Nhập thức uống bạn chọn: ");
        this.list = s.nextLine();
    }

    public void xuatThucUong(){
        System.out.printf("Danh sách thức uống bạn chọn: ");
        ThucUong kq = new ThucUong();
        menu.timKiem(list);
        kq.xuatTp();
    }

    public void nhapDsDichVu() throws FileNotFoundException {
        System.out.println("Danh sách dịch vụ");
        dichVu.docDsDichVu();
        dichVu.xuatDichVu();

        System.out.println("Nhập dịch vụ bạn chọn: ");
        this.list = s.nextLine();
    }

    public void xuatDsDichVu(){
        System.out.println("Danh sách dịch vụ bạn chọn: ");
        DichVu kq = new DichVu();
        menu.timKiem(list);
        kq.xuatDv();
    }

    public void nhapNgayThue() throws ParseException {
        System.out.println("Nhập ngày muốn thuê: ");
        this.ngayThue = F.parse(s.nextLine());
    }

    public void xuatNgayThue() throws ParseException {
        System.out.println("Ngày thuê: ");
        Date date = new Date();
        date = F.parse(String.valueOf(ngayThue));
    }



    public void nhapBuaTiec() throws FileNotFoundException, ParseException {
        System.out.println("Nhập tên bữa tiệc: ");
        this.setTenBuaTiec(getS().nextLine());
        nhapSanhBuaTiec();
        nhapNgayThue();
        nhapDsThucAnBuaTiec();
        nhapDsThucUong();
        nhapDsDichVu();


    }


    public void xuatBuaTiec() throws ParseException {
        System.out.printf("Tên bữa tiệc là: %s", this.tenBuaTiec);
        System.out.printf("Thời điểm thuê sảnh là: ", this.thoiDiemThue);
        xuatNgayThue();
        xuatThucAnBuaTiec();
        xuatThucUong();
        xuatDsDichVu();
    }


    public String getTenBuaTiec() {
        return tenBuaTiec;
    }

    public void setTenBuaTiec(String tenBuaTiec) {
        this.tenBuaTiec = tenBuaTiec;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public ThoiDiemThue getThoiDiemThue() {
        return thoiDiemThue;
    }

    public void setThoiDiemThue(ThoiDiemThue thoiDiemThue) {
        this.thoiDiemThue = thoiDiemThue;
    }

    public QuanLySanhCuoi getSanhCuoi() {
        return Sc;
    }

    public void setSanhCuoi(QuanLySanhCuoi sanhCuoi) {
        Sc = sanhCuoi;
    }

    public QuanLyThucPham getMenu() {
        return menu;
    }

    public void setMenu(QuanLyThucPham menu) {
        this.menu = menu;
    }

    public QuanLyDichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(QuanLyDichVu dichVu) {
        this.dichVu = dichVu;
    }

    public Scanner getS() {
        return s;
    }

    public double getDonGiaThueSanh() {
        return donGiaThueSanh;
    }

    public void setDonGiaThueSanh(double donGiaThueSanh) {
        this.donGiaThueSanh = donGiaThueSanh;
    }

    public double getDonGiaThueThueThoiDiem() {
        return donGiaThueThueThoiDiem;
    }

    public void setDonGiaThueThueThoiDiem(double donGiaThueThueThoiDiem) {
        this.donGiaThueThueThoiDiem = donGiaThueThueThoiDiem;
    }
}
