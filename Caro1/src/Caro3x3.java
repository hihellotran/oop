//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.util.Scanner;

public class Caro3x3 {
    Square[][] square; // bàn cờ caro
    People people1;
    People people2;
    String turn;

    public Caro3x3(People people1, People people2) {
        square = new Square[3][3];
        for (int i = 0; i < this.square.length; ++i) {
            for (int j = 0; j < this.square[i].length; ++j) {
                this.square[i][j] = new Square();// khởi tạo từng phần tử trong mảng
            }
        } // khởi tạo từng ô cho bàn cờ

        this.people1 = people1;
        this.people2 = people2;
        this.turn = people1.symbol;
    }

    private void PrintCaro() {
        for (int i = 0; i < this.square.length; ++i) {
            for (int j = 0; j < this.square[i].length; ++j) {
                PrintStream var10000 = System.out;
                String var10001 = this.square[i][j].getGiatri();
                var10000.print(var10001 + " ");
            }

            System.out.println();
        }

        System.out.println("----------------");
    }

    private void PrintPeopleInfo() {
        System.out.println(this.people1.toString());
        System.out.println(this.people2.toString());
    }

    private boolean nextStep(int i, int j) { // ghi nhận lại ô caro mà ng dùng muốn đánh
        if (i < 0 || j < 0 || i > 2 || j > 2) {
            System.out.println("Nhập sai, xin mời nhập lại");
            return false;
        }
        if (this.square[i][j].checkSquare()) { // chưa ai đi ô i,j
            this.square[i][j].giatri = this.turn; // ký tự đang chơi
            if (this.turn.equals("x")) {
                this.turn = "o";
            } else {
                this.turn = "x";
            }
            return true; // đi thành cong
        } else {
            System.out.println("Mời bạn đi ô khác");
            return false; // không đc đi
        }
    }


    public void playConsole() { // hàm chạy game dưới dạng console
        this.PrintPeopleInfo();
        this.PrintCaro();
        Scanner scanner = new Scanner(System.in);
        while (!this.checkEnd()) { // chưa ai ai thắng thì làm hoài
            if (this.turn.equals("x")) {
                System.out.println("Mời bạn " + this.people1.name);
            } else {
                System.out.println("Mời bạn " + this.people2.name);
            }

            System.out.print("Nhập dòng bạn muốn :");
            int dong = scanner.nextInt();
            System.out.print("Nhập cột bạn muốn :");
            int cot = scanner.nextInt();

            this.nextStep(dong, cot);
            this.PrintCaro();
        }
    }


    public int checkNgang() { // coi coi Ai thắng hàng ngang
        for (int i = 0; i < this.square.length; ++i) {
            int sumX = 0;
            int sumO = 0;

            for (int j = 0; j < this.square[i].length; ++j) {
                if (this.square[i][j].getGiatri().equals(KyTuCaro.x.toString())) {
                    ++sumX;
                    //nSystem.out.println("sumX=" + sumX);
                }

                if (this.square[i][j].getGiatri().equals(KyTuCaro.o.toString())) {
                    ++sumO;
                   // System.out.println("sumO=" + sumO);
                }
            }

            if (sumX == 3) {
                return 1;
            }

            if (sumO == 3) {
                return -1;
            }
        }

        return 0;
    }

    public int checkCheoChinh(){
        int sumX=0;
        int sumY=0;
        for (int i=0; i<square.length; i++){
            if (this.square[i][i].getGiatri().equals(KyTuCaro.x.toString())){
                sumX++;
            }
            if (this.square[i][i].getGiatri().equals(KyTuCaro.o.toString())){
                sumY++;
            }
            if (sumX==3){
                return 1;
            }
            if (sumY==3){
                return -1;
            }
        }
        return 0;
    }

    public int checkCheoPhu(){
        int sumX=0;
        int sumY=0;
        for (int i= square.length-1; i>=0; i--){
            int cot_hien_tai = (square.length-1) - i;
            if (this.square[i][cot_hien_tai].getGiatri().equals(KyTuCaro.x.toString())){
                sumX++;
            }
            if(this.square[i][cot_hien_tai].getGiatri().equals(KyTuCaro.o.toString())){
                sumY++;
            }
            if (sumX==3){
                return 1;
            }
            if (sumY==3){
                return -1;
            }
        }
        return 0;
    }
    public int checkDoc() { // coi coi Ai thắng dọc
        int SL_dong = this.square.length;
        int SL_cot = this.square[0].length;
        for (int i = 0; i < SL_cot; ++i) {
            // khai báo cho từng cột
            int sumX = 0;
            int sumY = 0;
            for (int j = 0; j < SL_dong; ++j) {

                if (this.square[j][i].getGiatri().equals(KyTuCaro.x.toString())) {
                    ++sumX;
                }

                if (this.square[j][i].getGiatri().equals(KyTuCaro.o.toString())) {
                    ++sumY;
                }
            }
            if (sumX == 3) {
                return 1; // x thắng
            }

            if (sumY == 3) {
                return -1; // y thắng
            }
        }

        return 0;
    }

    private boolean checkEnd() {// kiểm tra ai thắng ?
        if (this.checkNgang() == 1) { // trường hợp x thắng hàng ngang
            if (this.people1.symbol.equals("x")) {
                System.out.println(this.people1.name + " thắng");
                people1.score++;
            } else {
                System.out.println(this.people2.name + " thắng");
                people2.score++;
            }

            return true; // kết thúc
        }

        if (this.checkNgang() == -1) { // trường hợp o thắng hàng ngang
            if (this.people1.symbol.equals("o")) {
                System.out.println(this.people1.name + " thắng");
                people1.score++;
            } else {
                System.out.println(this.people2.name + " thắng");
                people2.score++;
            }

            return true; // kết thúc
        }

        if (this.checkCheoChinh()==1){
            if (this.people1.symbol.equals("x")){
                System.out.println(this.people1.name + " thắng");
                people1.score++;
            }
            else {
                System.out.println(this.people2.name + " thắng");
                people2.score++;
            }
            return true;
        }

        if (this.checkCheoChinh()==-1){
            if (this.people1.symbol.equals("o")){
                System.out.println(this.people1.name+ " thắng");
                people1.score++;
            }
            else {
                System.out.println(this.people2.name+ " thắng");
                people2.score++;
            }
            return true;
        }

        if (this.checkDoc() == 1) { // trường hợp x thắng hàng dọc
            if (this.people1.symbol.equals("x")) {
                System.out.println(this.people1.name + " thắng");
                people1.score++;
            } else {
                System.out.println(this.people2.name + " thắng");
                people2.score++;
            }

            return true;
        }
        if (this.checkDoc() == -1) { // trường hợp o thắng hàng dọc
            if (this.people1.symbol.equals("o")) {
                System.out.println(this.people1.name + " thắng");
                people1.score++;
            } else {
                System.out.println(this.people2.name + " thắng");
                people2.score++;
            }
            return true; // kết thúc
        }

        if (this.checkCheoPhu()==1){
            if (this.people1.symbol.equals("x")){
                System.out.println(this.people1.name+ " thắng");
                people1.score++;
            }
            else {
                System.out.println(this.people2.name + " thắng");
                people2.score++;
            }
            return true;
        }

        if (this.checkCheoPhu()==-1){
            if (this.people1.symbol.equals("x")){
                System.out.println(this.people1.name+ " thắng");
                people1.score++;
            }
            else {
                System.out.println(this.people2.name + " thắng");
                people2.score++;
            }
            return true;
        }

        return false;
    }
}
