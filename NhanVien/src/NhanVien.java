public class NhanVien {
    String ten;
    int tuoi;
    int luong;
    int namsinh;
    int giolam;

    public NhanVien(){

    }
    public NhanVien(String ten, int tuoi, int luong, int namsinh, int giolam){
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
        this.namsinh = namsinh;
        this.giolam = giolam;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", luong=" + luong +
                ", namsinh=" + namsinh +
                ", giolam=" + giolam +
                '}';
    }
}
