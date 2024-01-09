import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        String a,c, d;
//        a=c=d="1";
//        int  b=1 ;
        String[] ten = {"Trân", "Tuấn", "Tomboy", "Pê đê", "Anh chai", "Khai", "Thảo"};
        String[] gioitinh = {"nam", "nữ"};
        String[] diachi = {"hồ chí minh", "Long An", "Tây Ninh", "Củ chi", "Nhà Bè"};



        Random random = new Random();

        QLCB qlcb = new QLCB();

        while (true){
            System.out.println("1.Thêm cán bộ");
            System.out.println("2.Hiển thị");
            System.out.println("3.Tìm kiếm");
            System.out.println("4.Thoát");

            System.out.println("Nhập lựa chọn:");
            int choice = sc.nextInt();

            switch (choice){

                case 1:
                    System.out.print("Nhập số lượng cán bộ muốn thêm:");
                    int n = sc.nextInt();
                    for (int i = 0; i<n; i++){

                        System.out.println("Nhân viên thứ" + " " + (i+1));

                        System.out.println("Nhập tên:");
                        String randomName = ten[random.nextInt(ten.length)];
                        System.out.println(randomName);

                        System.out.println("Nhập tuổi:");
                        int randomTuoi = random.nextInt(43)+17;
                        System.out.println(randomTuoi);
                        sc.nextLine();

                        System.out.println("Nhập giới tính:");
                        String randomGioitinh = gioitinh[random.nextInt(gioitinh.length)];
                        System.out.println(randomGioitinh);


                        System.out.println("Nhập địa chỉ:");
                        String randomDiachi = diachi [random.nextInt(diachi.length)];
                        System.out.println(randomDiachi);


                        System.out.println("Các loại cán bộ muốn thêm:");
                        System.out.println("1. Nhân viên");
                        System.out.println("2.Kỹ sư");
                        System.out.println("3.Công nhân");
                        System.out.println();

                        System.out.println("Nhập loại các bộ muốn thêm:");
                        int loai_cb = sc.nextInt();
                        sc.nextLine();

                        if(loai_cb == 1 ){
                            System.out.println("Nhập công việc:");
                            String cv = sc.nextLine();
                            NhanVien nv = new NhanVien(randomName, randomTuoi, randomGioitinh,
                                    randomDiachi, cv);
                            qlcb.ThemCanBo(nv);
                        }

                        else if(loai_cb == 2){
                            System.out.println("Nhập ngành đào tạo:");
                            String nganh = sc.nextLine();
                            KySu ks = new KySu(randomName, randomTuoi, randomGioitinh,
                                    randomDiachi, nganh);
                            qlcb.ThemCanBo(ks);
                        }

                        else if (loai_cb == 3){
                            System.out.println("Nhập bậc:");
                            int bac = random.nextInt(9)+1;
                            CongNhan cn = new CongNhan(randomName, randomTuoi, randomGioitinh,
                                    randomDiachi, bac);
                            qlcb.ThemCanBo(cn);
                        }

                        else {
                            System.out.println("Không hợp lệ");
                        }

                    }
                    break;
                case 2:
                    qlcb.HienThi();
                    break;

                case 3:
                    System.out.println("Nhập tên cán bộ cần tìm:");
                    sc.nextLine();
                    String name = sc.nextLine();

                    qlcb.TimKiem(name);

                    break;

                case 4:
                    System.exit(0);
                    System.out.println("Chương trình đã kết thúc");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
        }


//        for (int i = 0; i< n; i++){

            /*System.out.println("Nhập tên:");
            a = sc.nextLine();
            a = sc.nextLine();

            sc.nextLine();

            System.out.println("Nhập tuổi:");
            b = sc.nextInt();

            sc.nextLine();

            System.out.println("Nhập giới tính:");
            c = sc.nextLine();


            System.out.println("Nhập địa chỉ:");
            d = sc.nextLine();
*/
//            a=c=d=Integer.toString(i);
//            b=i;
//            CanBo canBo = new CanBo(a,b,c,d);

//            qlcb.ThemCanBo(canBo);

//            System.out.println("Thông tin của cán bộ thứ:" + (i+1));

        }
//        String answer;
//        System.out.println("bạn có muốn hiển thị thông tin cán bộ không ? (nhập:y/n)");
//        answer = sc.nextLine();
//        answer = sc.nextLine();
//        if(answer.equals("y")){
//            System.out.println("danh sách cán bộ:");
//            qlcb.HienThi();
//        }
//        else {
//            System.out.println("Thank you");
//        }
    }
}