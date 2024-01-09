public class PartTime extends NhanVien{

    public PartTime(String ten, int tuoi, int luong, int namsinh, int giolam){
        super( ten,  tuoi,  luong,  namsinh,  giolam);
    }

    public double ThuNhaPart(){
        return luong * 1.5;
    }
}
