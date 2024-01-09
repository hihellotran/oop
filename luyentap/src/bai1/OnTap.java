package bai1;

public class OnTap {


    public OnTap(){

    }
    public void Ratios(int[] arr){
        int tongSoAm = 0;
        int tongSoduong = 0;
        int tongSoko = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i]<0){
                tongSoAm++;
//                am= am/arr.length;
            }
          else if (arr[i]>0){
                tongSoduong++;
//                duong= duong/ arr.length;
            }
            else {
                tongSoko ++;
//                ko = ko/arr.length;
            }
        }
        System.out.println("Tỷ lệ số dương trong mảng là:" +tongSoduong +"/" +arr.length);
        System.out.println("Tỷ lệ số âm trong mảng là:" + (double)tongSoAm/arr.length);
        System.out.println("Tỷ lệ số 0 trong mảng là:" + (double)tongSoko/arr.length);
    }
}
