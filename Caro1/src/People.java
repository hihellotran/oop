//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class People {
    String name;
    int score;
    String symbol;

    public People() {
    }

    public People(String name, int score, String symbol) {
        this.name = name;
        this.score = score;
        this.symbol = symbol;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String toString() {
        return "People{name='" + this.name + "', score=" + this.score + ", symbol='" + this.symbol + "'}";
    }
}
