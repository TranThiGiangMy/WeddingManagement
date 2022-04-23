package TiecCuoi;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
//        SanhCuoi s1 = new SanhCuoi("Sanh 1", "Tang 1", "500", 5000000);
//        SanhCuoi s2 = new SanhCuoi("Sanh 2", "Tang 2", "500", 4500000);
//        SanhCuoi s3 = new SanhCuoi();
//        s3.nhapSanh();

        DichVu dv1 = new DichVu("DV1", "Dich vu karaoke", 50000);
//        DichVu dv2 = new DichVu("DV2", "Dich vu trang tri", 10000);
//        DichVu dv3 = new DichVu();
//        dv3.nhapDichVu();

        QuanLyDichVu qldv = new QuanLyDichVu();
        List<DichVu> kqdv = new ArrayList<>();
        qldv.docDSDV();

        System.out.println("========DANH SÁCH DỊCH VỤ=============");
        qldv.xuatDV();

        qldv.themDichVu(dv1);
        System.out.println("========DANH SÁCH DỊCH VỤ SAU KHI THÊM=============");
        qldv.xuatDV();

        System.out.println("DANH SACH TIM KIEM");
        kqdv  = qldv.timKiemDV("Dịch vụ karaoke");
        kqdv.forEach(s -> s.xuatDichVu());


//        QuanLySanhCuoi ql = new QuanLySanhCuoi();
//        List<SanhCuoi> kq = new ArrayList<>();
//
//        ql.themSanhCuoi(s1);
//        ql.themSanhCuoi(s2);
//        ql.themSanhCuoi(s3);
//        System.out.println("===DANH SACH SANH CUOI===");
//        ql.xuatSanh();
////
//        ql.xoaSanh("Sanh 2");
//        System.out.println("===DANH SACH SANH CUOI SAU KHI XOA===");
//        ql.xuatSanh();
////
////
//        System.out.println("DANH SACH TIM KIEM");
//        kq = ql.timKiem("Tang 3");
//        kq.forEach(s -> s.xuatSanh());
//
//        System.out.println("Danh sach sanh cuoi chua tu khoa 'Tang 1'");
//        ql.timKiem("Tang 3").forEach(s -> s.xuatSanh());
//
//        System.out.println("Danh sach sanh cuoi co suc chua 400");
//        ql.timKiem("500").forEach(s -> s.xuatSanh());


//        s1.xuatSanh();
//        s2.xuatSanh();
//        s3.xuatSanh();


    }
}
