import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Tron hinh1 = new Tron("red", "circle 1", 3.5);
//        System.out.println(hinh1.ChuVi());
//        ChuNhat hinh2 = new ChuNhat("blue", "rectangle 1", 2 ,3);
//        System.out.println(hinh2.DienTich());

        List<Hinh> hinhList = new ArrayList<Hinh>();
        Random random = new Random();
        int n = 5;
        for (int i = 0; i<n; i++){
            if (random.nextInt(2) == 0){
                Tron hinh1 = new Tron("red", "circle" ,
                        random.nextDouble());
                hinhList.add(hinh1);

            }
            else {
                ChuNhat hinh2 = new ChuNhat("blue","rectangle" ,
                        random.nextInt(10), random.nextInt(10));
                hinhList.add(hinh2);
            }
            System.out.println(hinhList.get(i).color + " " + hinhList.get(i).name + " " + hinhList.get(i).DienTich());
        }

        double max;
        Hinh hinh_lon_nhat = hinhList.get(0); // hinh dau tien
       // max = hinh_lon_nhat.DienTich(); // dien tich cua hinh lon nhat
        for (int i = 1; i<n ;i++){
           if (hinh_lon_nhat.DienTich() < hinhList.get(i).DienTich()){
               hinh_lon_nhat = hinhList.get(i);
           }
        }
        System.out.println(hinh_lon_nhat.color + " " + hinh_lon_nhat.name + " " + hinh_lon_nhat.DienTich());
    }
}