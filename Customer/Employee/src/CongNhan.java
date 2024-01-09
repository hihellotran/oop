public class CongNhan extends CanBo {
    int bac;

    public CongNhan(String name, int age, String sex, String address,int bac) {
        super(name, age,  sex, address);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + "CongNhan{" +
                "bac=" + bac +
                '}';
    }
}
