public class Main {
    public static void main(String[] args) {
        People people1 = new People("Tran", 0, "x");
        People people2 = new People("Tuan", 0, "o");
        Caro3x3 caro3x3 = new Caro3x3(people1, people2);
        caro3x3.playConsole();



    }
}