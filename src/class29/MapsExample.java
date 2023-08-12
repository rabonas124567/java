package class29;

import java.util.*;

public class MapsExample {
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA","WASHGTON");
        countries.put("TURKEY","ANKARA");
        countries.put("FARANCE","PARIS");
        countries.put("ITALY","ROME");
        System.out.println(countries);



        System.out.println("===========================================================");
        Iterator<Map.Entry<String,String>> getboth1=countries.entrySet().iterator();
       while(getboth1.hasNext()){
            Map.Entry<String,String> getdata1=getboth1.next();
           System.out.println(getdata1.getKey()+"   "+getdata1.getValue());
        }
       System.out.println("===========================================================");
       Set<Map.Entry<String,String>> getboth=countries.entrySet();
        for (Map.Entry<String,String> getdata:getboth
             ) {
            System.out.println(getdata.getKey()+"   "+getdata.getValue());
        }
        System.out.println("===========================================================");
        for (String getvalues:countries.values()
             ) {
            System.out.println(getvalues);
        }
        System.out.println("=============================================================");
        Iterator<String> getvalue=countries.values().iterator();
        while(getvalue.hasNext()){
            System.out.println(getvalue.next());

        }



    }
}
