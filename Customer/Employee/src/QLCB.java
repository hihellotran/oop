import java.util.ArrayList;
import java.util.List;

public class QLCB {
    List<CanBo> ds_can_bo;
    
    public QLCB(){
        ds_can_bo = new ArrayList<CanBo>();
    }
    public void ThemCanBo(CanBo canbo){
        ds_can_bo.add(canbo);
    }
    
    public void HienThi(){
        for (CanBo cb: ds_can_bo
             ) {
            System.out.println(cb.toString());
        }

    }

    public void TimKiem(String Search_name){

        for (CanBo cb: ds_can_bo){

            if(cb.getName().equals(Search_name)) {
                System.out.println(cb.toString());
            }
        }
    }
}
