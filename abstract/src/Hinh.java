public abstract class Hinh {
    String color;
    String name;

    public Hinh(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public abstract Double ChuVi();

    public abstract Double DienTich();
}
