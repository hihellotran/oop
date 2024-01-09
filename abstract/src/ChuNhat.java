public class ChuNhat extends Hinh {
    int dai;
    int rong;

    public ChuNhat(String color, String name, int dai, int rong) {
        super(color, name);
        this.dai = dai;
        this.rong = rong;
    }

    public Double ChuVi() {
        return Double.valueOf((dai + rong) * 2);
    }

    public Double DienTich() {
        return Double.valueOf(dai * rong);
    }
}
