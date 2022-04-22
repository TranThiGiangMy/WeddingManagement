package TiecCuoi;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        SanhCuoi s1 = new SanhCuoi("Sanh 1", "Tang 1", 500, 5000000);
        SanhCuoi s2 = new SanhCuoi("Sanh 2", "Tang 2", 318, 4500000);
//        SanhCuoi s3 = new SanhCuoi();
//        s3.nhapSanh();

        QuanLySanhCuoi ql = new QuanLySanhCuoi();
        List<SanhCuoi> kq = new ArrayList<>();

        ql.themSanhCuoi(s1);
        ql.themSanhCuoi(s2);
        System.out.println("===DANH SACH SANH CUOI===");
        ql.xuatSanh();

//        ql.xoaSanh(s3);
//        System.out.println("===DANH SACH SANH CUOI SAU KHI XOA===");
//        ql.xuatSanh();
        System.out.println("Danh sach sanh cuoi chua tu khoa 'Tang 1'");
        ql.timKiem("Tang 3").forEach(s -> s.xuatSanh());

        System.out.println("Danh sach sanh cuoi co suc chua 400");
        ql.traCuu(400).forEach(s -> s.xuatSanh());


//        s1.xuatSanh();
//        s2.xuatSanh();
//        s3.xuatSanh();


    }
}
