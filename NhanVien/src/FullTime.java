public class FullTime extends NhanVien {
    public FullTime(String ten, int tuoi, int luong, int namsinh, int giolam){
        super( ten,  tuoi,  luong,  namsinh,  giolam);
    }
    public double ThuNhapFull(){
        return luong * 1.2;

    }

}
