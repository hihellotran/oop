//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Square {
    int dong;
    int cot;
    String giatri;

    public Square() {
        this.giatri = "?";
    }

    public Square(int dong, int cot, String giatri) {
        this.dong = dong;
        this.cot = cot;
        this.giatri = giatri;
    }

    public int getDong() {
        return this.dong;
    }

    public void setDong(int dong) {
        this.dong = dong;
    }

    public int getCot() {
        return this.cot;
    }

    public void setCot(int cot) {
        this.cot = cot;
    }

    public String getGiatri() {
        return this.giatri;
    }

    public void setGiatri(String giatri) {
        this.giatri = giatri;
    }

    public boolean checkSquare() {
        return this.giatri.equals("?");// ? là ô trống
    }
}
