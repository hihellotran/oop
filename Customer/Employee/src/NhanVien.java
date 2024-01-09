public class NhanVien extends CanBo {
    String cv;

    public NhanVien(String name,int age, String sex, String address, String cv ){
        super(name, age, sex, address);
        this.cv = cv;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return super.toString() +"NhanVien{" +
                "cv='" + cv + '\'' +
                '}';
    }
}
