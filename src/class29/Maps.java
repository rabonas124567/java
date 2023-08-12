package class29;


import java.util.*;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.put("APPLE",10.5);
        grocery.put("SOAP",20.5);
        grocery.put("DETERGENT",10.5);
        grocery.put("CHERRY",400.5);
        grocery.put("BANANA",50.5);


        Iterator<Map.Entry<String,Double>> getboth2=grocery.entrySet().iterator();
        while(getboth2.hasNext()){
            Map.Entry<String,Double> entry=getboth2.next();
            if(entry.getKey().equals("DETERGENT") &&entry.getValue().equals(10.5)){
                getboth2.remove();
            }
        }
        System.out.println(grocery);

      /*  Iterator<Map.Entry<String,Double>> getboth2=grocery.entrySet().iterator();
        while(getboth2.hasNext()){
            Map.Entry<String,Double> entry=getboth2.next();
            if(entry.getKey().contains("A")){
                getboth2.remove();
            }
        }
        System.out.println(grocery);

       */

      /*  Set<Map.Entry<String,Double>> getboth=grocery.entrySet();
        for (Map.Entry<String,Double> getdata:getboth
        ) {
            System.out.println(getdata.getKey()+"  "+getdata.getValue());
        }

       */


       /* System.out.println(grocery);
        Set<String> getkeys=grocery.keySet();
        System.out.println(getkeys);
        Collection<Double> getvalues=grocery.values();
        System.out.println(getvalues);

        */



    }
}
