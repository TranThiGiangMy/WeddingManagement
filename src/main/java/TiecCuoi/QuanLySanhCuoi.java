package TiecCuoi;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuanLySanhCuoi {
    private List<SanhCuoi> ds = new ArrayList<>();

    public void themSanhCuoi(SanhCuoi s) {this.ds.add(s);}

    public void xuatSanh(){
        this.ds.forEach(s -> s.xuatSanh());
    }

    public void docDsSanh() throws FileNotFoundException, ParseException{
        File f = new File("D:\\BTL\\WeddingRestaurantManagement\\src\\main\\resources\\SanhCuoi.txt");
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNextLine()){
                String tenSanh = scanner.nextLine();
                String viTriSanh = scanner.nextLine();
                String sucChua = String.valueOf(scanner.nextLine()) ;
                int giaThue = Integer.valueOf(scanner.nextLine()) ;
//                SanhCuoi s = new SanhCuoi()
                SanhCuoi sc = new SanhCuoi(tenSanh, viTriSanh, sucChua, giaThue);
                this.ds.add(sc);
            }
        }
    }


    public List<SanhCuoi> timKiem(String kw){

        List<SanhCuoi> kq = new ArrayList<>();
        for(SanhCuoi s : this.ds) {
            if (s.getTenSanh().contains(kw) == true || s.getViTriSanh().contains(kw) == true || s.getSucChua().contains(kw) == true) {
                kq.add(s);
            }
        }
        if (kq.size() == 0)
            System.out.printf("Khong ton tai sanh chua %s trong danh sach.", kw);
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


    public void xoaSanh(String kw) {
        boolean flag = false;
        for (SanhCuoi s : this.ds)
            if(s.getTenSanh().contains(kw) == true || s.getViTriSanh().contains(kw) == true || s.getSucChua().contains(kw) == true) {
                this.ds.remove(s);
                flag = true;
                System.out.println("Xóa thành công!!!");
                break;
            }

        if (flag == false)
            System.out.printf("Không tìm thấy sảnh %s để xóa\n!", kw);
    }

//    public void xoaSanh(int n) {
//        boolean flag = false;
//        for (SanhCuoi s : this.ds)
//            if(s.getSucChua() == n) {
//                this.ds.remove(s);
//                flag = true;
//                System.out.println("Xóa thành công!!!");
//                break;
//            }
//
//        if (flag == false)
//            System.out.printf("Không tìm thấy sảnh có sức chứa %s để xóa\n!", n);
//    }


    public List<SanhCuoi> getDs() {
        return ds;
    }

    public void setDs(List<SanhCuoi> ds) {
        this.ds = ds;
    }
}
