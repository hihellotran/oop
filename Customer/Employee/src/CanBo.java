public class CanBo {
    String name;
    int age;
    String sex;
    String address;

    public CanBo(){

    }

    public CanBo(String name, int age, String sex, String address){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
