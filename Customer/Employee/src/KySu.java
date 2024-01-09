public class KySu extends CanBo {
    String nganh_dt;
    public KySu(String name, int age, String sex, String address, String nganh_dt){
        super(name, age, sex, address);
        this.nganh_dt = nganh_dt;
    }

    @Override
    public String toString() {
        return super.toString() + "KySu{" +
                "nganh_dt='" + nganh_dt + '\'' +
                '}';
    }
}
