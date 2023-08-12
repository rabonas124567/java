package class29;

import java.util.HashMap;
import java.util.Map;

public class MpaExample3 {
    public static void main(String[] args) {
        HashMap<String,Integer> employe=new HashMap<>();
        employe.put("jon",120);
        employe.put("jone",150);
        employe.put("jones",180);
        String employename="";
        int maxnumber=0;
        int sum=0;
        for (Map.Entry<String,Integer> emp:employe.entrySet()
             ) {
            sum=sum+emp.getValue();
          if(emp.getValue()>maxnumber){
              maxnumber=emp.getValue();
              employename=emp.getKey();
          }
        }
        System.out.println(employename+"  "+maxnumber+"  "+sum);


    }
}
