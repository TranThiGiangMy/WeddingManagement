package TiecCuoi;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDichVu {
    private List<DichVu> dv = new ArrayList<>();

    public void themDichVu(DichVu s) {this.dv.add(s);}

    public void xuatDV(){
        this.dv.forEach(s -> s.xuatDichVu());
    }
}
