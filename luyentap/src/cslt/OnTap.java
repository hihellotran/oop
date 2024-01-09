package cslt;

public class OnTap {
    public static void bai1(int n) {
        int tich = 1;
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tich = i * i * i;
            tong += tich;
            System.out.print(i + " ");
        }
        System.out.println("\nTổng= " + tong);
        System.out.println("Tích = " + tich);

    }

    public static void bai2(int n) {
        int tich = 1;
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tich = i * i;
            tong += tich;
            System.out.print(i + " ");
        }
        System.out.println("\nTổng= " + tong);
        System.out.println("Tích = " + tich);

    }

    public static void bai3(int n) {
        int sum = 0;
        float thuong = 1;
        for (int i = 1; i <= n; i++) {
            thuong = 1.0f / i;
            sum += thuong;
        }
        System.out.println(thuong);
    }

    public static void bai4(int n) {
        float sum = 0;
        float thuong = 1;
        for (int i = 1; i <= n; i++) {
            thuong = 1.0f / (i * (i + 1));
            sum += thuong;
        }
        System.out.println(sum);
    }

    public static void bai5(int n) {
        int tich = 1;
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tich *= i;
            tong += tich;
        }
        System.out.println(tong);
    }

    public static void tinhLuyThua(int x, int n) {
        int ketQua = 1;

        for (int i = 0; i < n; i++) {
            ketQua *= x;
        }
    }

    public static void bai6(int x, int n){
        int tich=1;
        int tong=0;
        for (int i=1; i<=n; i++){
            tich*=x;
            tong+=tich;
        }
    }
}
