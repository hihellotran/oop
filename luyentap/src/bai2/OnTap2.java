package bai2;

import java.util.Scanner;

public class OnTap2 {

    public static void MinMaxSum() {
        int[] A = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < A.length; i++) {
            int thangDangxet = A[i];
            int sum4tgCongLai = 0;
            for (int j = 0; j < A.length; j++) {
                if (i != j) sum4tgCongLai += A[j];
            }
            System.out.println(sum4tgCongLai);
        }

    }

    public static void ChuyenDoiGio(String gio_muon_chuyen) {// ví du 07:12:39PM
        String[] cat_chuoi = gio_muon_chuyen.split(":");
        String gio = cat_chuoi[0];
        String phut = cat_chuoi[1];
        String phan_con_lai = cat_chuoi[2];//3 9 P M
        String[] cat_phan_con_lai = phan_con_lai.split("");
        String giay = cat_phan_con_lai[0] + cat_phan_con_lai[1];
        String am_pm = cat_phan_con_lai[2] + cat_phan_con_lai[3];
        if (am_pm.equals("PM")) {
            int new_gio = Integer.parseInt(gio);
            new_gio += 12;
            gio = String.valueOf(new_gio);
            //System.out.println(gio + ":" + phut +":"+giay);
        } else if (gio.equals("12") && am_pm.equals("AM")) {
            gio = "0";
            //System.out.println(gio + ":" + phut + ":" + giay);
        }
        System.out.println(gio + ":" + phut + ":" + giay);

    }

    public static void test(int i) {//i==1
        if (i == 1) {
            i = 100;
        } else {
            if (i % 2 == 0) {
                i = -123;
            } else {
                i = 0;
            }
        }
        System.out.println(i); // i=100
    }

    public static void boiSo(int n){
        int sum = 0;
        for (int i=0; i<n; i+=5){
            if (i%5==0){
                sum+=i;
                System.out.print(i +" ");
            }
        }
        System.out.println("Sum=" + sum);
    }

}
