package TiecCuoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyDichVu {
    private List<DichVu> dv = new ArrayList<>();

    public void themDichVu(DichVu s) {this.dv.add(s);}

    public void xuatDV(){
        this.dv.forEach(s -> s.xuatDichVu());
    }

    public void docDSDV() throws FileNotFoundException, ParseException {
        File f = new File("C:\\Users\\tranm\\IdeaProjects\\BTL\\WeddingRestaurantManagement\\src\\main\\resources\\DichVu.txt");
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNextLine()){
                String maDV = scanner.nextLine();
                String tenDV = scanner.nextLine();
                int giaDV = Integer.valueOf(scanner.nextLine()) ;
                DichVu d = new DichVu(maDV, tenDV, giaDV);
                this.dv.add(d);
            }
        }
    }


    public List<DichVu> timKiemDV(String kw){

        List<DichVu> kq = new ArrayList<>();
        for(DichVu d : this.dv) {
            if (d.getTenDV().contains(kw) == true) {
                kq.add(d);
            }
        }
        if (kq.size() == 0)
            System.out.printf("Khong ton tai dich vu %s trong danh sach.", kw);
        return kq;

    }

//    public List<SanhCuoi> timKiem(int n){
//        List<SanhCuoi> kq = new ArrayList<>();
//        for(SanhCuoi s: this.ds)
//            if(s.getSucChua() == n)
//                kq.add(s);
//
//        if (kq.size() == 0)
//            System.out.printf("Không tìm thấy sảnh có sức chứa %s trong danh sách", n);
//        return kq;
//    }


    public void xoaDV(String kw) {
        boolean flag = false;
        for (DichVu s : this.dv)
            if(s.getTenDV().contains(kw) == true) {
                this.dv.remove(s);
                flag = true;
                System.out.println("Xóa thành công!!!");
                break;
            }

        if (flag == false)
            System.out.printf("Không tìm thấy sanh %s để xóa\n!", kw);
    }
}
