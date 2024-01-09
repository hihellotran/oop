public class Tron extends Hinh {
    double ban_kinh;
    public Tron(String color, String name, double ban_kinh){
        super(color, name);
        this.ban_kinh = ban_kinh;
    }

    public Double ChuVi(){
        return 2*Math.PI* ban_kinh;
    }

    public  Double DienTich(){
        return Math.PI * ban_kinh * ban_kinh;
    }

}
