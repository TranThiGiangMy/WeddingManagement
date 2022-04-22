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
        File f = new File("C:\\Users\\tranm\\IdeaProjects\\BTL\\src\\main\\resources\\SanhCuoi.txt");
        try (Scanner scanner = new Scanner(f)) {
            while (scanner.hasNextLine()){
                String tenSanh = scanner.nextLine();
                String viTriSanh = scanner.nextLine();
                int sucChua = Integer.valueOf(scanner.nextLine()) ;
                int giaThue = Integer.valueOf(scanner.nextLine()) ;
//                SanhCuoi s = new SanhCuoi()
                SanhCuoi sc = new SanhCuoi(tenSanh, viTriSanh, sucChua, giaThue);
                this.ds.add(sc);
            }
        }
    }

//    public SanhCuoi timKiem(int idS){
//        return this.ds.stream().filter(s -> s.getIdSanh() == idS).findFirst().get();
////        for(SanhCuoi s : this.ds)
////            if(s.getIdSanh() == idS)
////                return s;
////        return null;
//    }



    public List<SanhCuoi> timKiem(String kw){

//        return this.ds.stream().filter(s -> s.getMaSanh() == kw || s.getTenSanh().contains(kw) == true ||
//                s.getViTriSanh().contains(kw) == true).collect(Collectors.toList());
//
//        return this.ds.stream().filter(sc -> sc.getTenSanh().contains(kw) == true).collect(Collectors.toList());

//        List<SanhCuoi> kq = new ArrayList<>();
//        for(SanhCuoi s : this.ds) {
//            if (s.getTenSanh().contains(kw) == true || s.getViTriSanh().contains(kw) == true) {
//                kq.add(s);
//            }
//        }
//        if (this.ds == null)
//            System.out.printf("Khong ton tai sanh chua %s trong danh sach.", kw);
//        return kq;

        List<SanhCuoi> kq = new ArrayList<>();
        for(SanhCuoi s : this.ds)
            if(s.getTenSanh().contains(kw) == true || s.getViTriSanh().contains(kw) == true) {
                kq.add(s);
            }

        if (kq == null)
            System.out.printf("Khong co Sanh " + kw);
        return kq;
    }

    public List<SanhCuoi> traCuu(double n){
        List<SanhCuoi> kq = new ArrayList<>();
        for(SanhCuoi s: this.ds)
            if(s.getSucChua() == n)
                kq.add(s);


        if (kq == null)
            System.out.println("Khong tim thay");
        return kq;
    }

    public void xoaSanh(SanhCuoi s){
        for(SanhCuoi p: this.ds)
            if(p == s) {
                this.ds.remove(s);
                System.out.println("Xóa thành công!");
                break;
            }
        System.out.printf("Khong tim thay sanh %s de xoa\n", s.getTenSanh());

    }

    public List<SanhCuoi> getDs() {
        return ds;
    }

    public void setDs(List<SanhCuoi> ds) {
        this.ds = ds;
    }
}
