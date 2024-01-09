import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<NhanVien> nv = new ArrayList<NhanVien>();
        int n = 20;
        Random random = new Random();
//a.Cho 1 danh sách các nhân viên
        for (int i = 0; i < n; i++) {
            int nhanvien = random.nextInt(2);
            String t = String.valueOf(i);
            if (nhanvien == 1) {

                PartTime partTime = new PartTime("name" + t, random.nextInt(18) + 16, random.nextInt(90) + 10,
                        random.nextInt(2005 - 1985) + 1985, random.nextInt(23) + 1);
                nv.add(partTime);

            } else {
                FullTime fullTime = new FullTime("name" + t, random.nextInt(18) + 16, random.nextInt(90) + 10,
                        random.nextInt(2005 - 1985) + 1985, random.nextInt(23) + 1);
                nv.add(fullTime);

            }

        }
        for (NhanVien nhanVien : nv) {
            if (nhanVien instanceof PartTime){
                System.out.print("Nhân viên thời vụ:");
            }
            else if (nhanVien instanceof FullTime){
                System.out.print("Nhan vien toàn thời gian:");
            }
            System.out.println(nhanVien.toString());
        }

        //     b.Tính tổng thu nhập của nhân viên thời vụ
        int sumP = 0;
        for (NhanVien nhanVien : nv) {
            if(nhanVien instanceof PartTime) {
                sumP += nhanVien.luong;
            }

        }
        System.out.println("Tổng lương của nhân viên thời vụ:" + " " + sumP);

        //c.Tính tổng thu nhập của tất cả nhân viên
        int sum = 0;
        for (NhanVien nhanVien : nv) {
            sum += nhanVien.luong;

        }
        System.out.println("Tổng lương" + " " + sum);

        //d.In ra tất cả nhân viên toàn thời gian có năm sinh > 2000
        System.out.println("Sinh viên toàn thời gian có năm sinh > 2000:");
        for (NhanVien nhanVien : nv){
            if(nhanVien instanceof FullTime && nhanVien.namsinh>2000){
             System.out.println(nhanVien.toString());
            }
        }

    }
}