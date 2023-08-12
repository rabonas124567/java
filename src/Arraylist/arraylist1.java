package Arraylist;

import com.beust.ah.A;
import com.sun.javafx.collections.VetoableListDecorator;

import java.util.*;

public class arraylist1 {


    public static void main(String[] args) {
       /* byte name;
        int name1;
        short name2;
        long name3;
        double name4;
        float name5;
        char name7;
        boolean name8;
        //These are the classes of primative data type to use them in in collection frames.becase in the simple data
        // type we can not use in so we use the wrapper classes
        Byte name9;
        Integer name10;
        Short name12;
        Long name13;
        Double name14;
        Float name15;
        Character name17;
        Boolean name18;

        */

        //This is the way of converting string into the integer
      /*  String number="10";
        Integer intnum=Integer.parseInt(number);

       */

       /* System.out.println("-------------------------------------------------");
        //This is the way of converting of int to Integer class
        int number2=100;
        Integer number3=number2;
        System.out.println(number3);
        System.out.println("-------------------------------------------------");
//This is boxing putting a primitive type into a wrapper
        Integer number4=new Integer(10);
        System.out.println(number4);
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
//This is auto inboxing putting a primitive type into a wrapper but in a short way
        Integer number5=200;
        int number7=number5.intValue();// unboxing longer way
        int number6=number5; //aouto unboxing short way
        System.out.println(number4);
        System.out.println("-------------------------------------------------");

        */

       /* ArrayList<String> noofname= new ArrayList<>();
        System.out.println("The size is "+noofname.size());
        noofname.add("snobar");
        noofname.add("rabonas");
        System.out.println("The size is "+noofname.size());
        System.out.println("The names are  "+noofname);
        noofname.remove("snobar");
        System.out.println("The size is "+noofname.size());
        System.out.println("The names are  "+noofname);

        */
        /*ArrayList<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(11);
        number.add(12);
        System.out.println(number);
        ArrayList<Boolean> number2=new ArrayList<>();
        number2.add(true);
        number2.add(false);
        System.out.println(number2);

         */
       /* ArrayList<String> number2=new ArrayList<>();
        number2.add("SDLC");
        number2.add("MANUAL TESTING");
        number2.add("GIT");
        number2.add("JAVA");
        number2.add("SELENIUM");
        number2.add("TESTNG");
        System.out.println(number2);
        System.out.println(number2.size());

        number2.remove("JAVA");
        System.out.println(number2);
        System.out.println(number2.indexOf("SELENIUM"));

        */


        /*ArrayList<String> number2=new ArrayList<>();
        number2.add("SDLC");
        number2.add("MANUAL TESTING");
        number2.add("GIT");
        number2.add("JAVA");
        number2.add("SELENIUM");
        number2.add("TESTNG");
        System.out.println(number2);
        number2.add("RABONAS");
        System.out.println(number2);
        number2.add(4,"SANOBAR");
        System.out.println(number2);

         */
       /* ArrayList<String> number2=new ArrayList<>();
        number2.add("SDLC");
        number2.add("MANUAL TESTING");
        number2.add("GIT");
        ArrayList<String> number3=new ArrayList<>();
        number3.add("JAVA");
        number3.add("SELENIUM");
        number3.add("TESTNG");
        ArrayList<String> number4=new ArrayList<>();
        number4.addAll(number2);
        number4.addAll(number3);
        System.out.println(number4);
        number4.clear();
        System.out.println(number4);

        */
       /* ArrayList <String> remove1=new ArrayList<>();
        remove1.add("SDLC");
        remove1.add("JAVA");
        remove1.add("SNOBAR");
        remove1.add("SELEIUM");
        remove1.add("TESTNG");
        ArrayList <String> remove2=new ArrayList<>();
        remove2.add("SDLC");
        remove2.add("JAVA");
        remove2.add("SELEIUM");
        remove2.add("TESTNG");
        System.out.println(remove2);
        remove1.removeAll(remove2);
        System.out.println(remove1);

        */
       /* ArrayList <String> remove1=new ArrayList<>();
        remove1.add("SDLC");
        remove1.add("JAVA");
        remove1.add("SNOBAR");
        remove1.add("SELEIUM");
        remove1.add("TESTNG");
        ArrayList <String> remove2=new ArrayList<>();
        remove2.add("SDLC");
        remove2.add("JAVA");
        remove2.add("SELEIUM");
        remove2.add("TESTNG");
        System.out.println(remove1);
        remove1.retainAll(remove2);
        System.out.println(remove1);

        */
        //Different loop for the Arraylist
     /*   ArrayList <String> remove1=new ArrayList<>();
        remove1.add("SDLC");
        remove1.add("JAVA");
        remove1.add("SNOBAR");
        remove1.add("SELEIUM");
        remove1.add("TESTNG");
        remove1.add("SDLC");
        remove1.add("JAVA");
        remove1.add("SELEIUM");
        remove1.add("TESTNG");
        //For(i) loop is not good when the size of Array is going to be change
        for (int i = 0; i < remove1.size(); i++) {
            if(remove1.get(i).length()>4){
                remove1.remove(i);
            }

        }

        System.out.println(remove1);
        */
       /* ArrayList <String> remove1=new ArrayList<>();
        remove1.add("SDLC");
        remove1.add("JAVA");
        remove1.add("SNOBAR");
        Iterator<String> Iterater=remove1.iterator();
        System.out.println(Iterater.hasNext());
        System.out.println(Iterater.next());
        System.out.println(Iterater.hasNext());
        System.out.println(Iterater.next());
        System.out.println(Iterater.hasNext());
        System.out.println(Iterater.next());
        Iterater.remove(); //This method will remove the previously stored value in the ArrayList
        System.out.println(remove1);
        System.out.println(Iterater.hasNext());

        */


        //  System.out.println(Iterater.next()); now at this point there is no next member so it will give the error
       /* ArrayList <String> remove1=new ArrayList<>();

        remove1.add("SDLC");
        remove1.add("JAVA");
        remove1.add("SNOBAR");

        Iterator<String> Iterater=remove1.iterator();
      while(Iterater.hasNext()){
          String name=Iterater.next();
          if(name.length()>4){
              Iterater.remove();
          }
      }
        System.out.println(remove1);

        */


        //We can store ArrayLists in other ArrayLists
      /*  ArrayList <String> add1=new ArrayList<>();
        ArrayList <String> add2=new ArrayList<>();
        ArrayList <String> add3=new ArrayList<>();
        ArrayList <ArrayList<String>> add4=new ArrayList<>();
        add4.add(add1);
        add4.add(add2);
        add4.add(add3);
        System.out.println(add4);

       */
       /* HashSet<String>  fruity=new HashSet<>();
        fruity.add("Apple");
        fruity.add("Apple");
        fruity.add("Banana");
        fruity.add("orange");
        System.out.println(fruity);
        ArrayList <String> add1=new ArrayList<>(fruity);
        System.out.println(add1);
        LinkedHashSet<String> add2=new LinkedHashSet<>(fruity);
        
        */
      /*  ArrayList<String> cars = new ArrayList<>();
        cars.add(" bmw");
        cars.add(" honda");
        cars.add(" zuzuki");
        cars.add(" carola");

       */
       /* for (String car : cars
        ) {
            System.out.println(car);
        }
        System.out.println("----------------------------------------------");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i) + "   " + cars.get(i).length());
        }

        */
       /* System.out.println("----------------------------------------------");
        Iterator<String> iterater = cars.iterator();
        while (iterater.hasNext()) {
            String name = iterater.next();
            System.out.println(name);
           }

        */
      /*  int i=0;
        while(i<cars.size()){
            System.out.println(cars.get(i));
            i++;
        }

       */
      /*  ArrayList<String> cars = new ArrayList<>();
        cars.add(" bmw");
        cars.add(" honda");
        cars.add(" zuzuki");
        cars.add(" carola");

       */
        //In such cases where the size of the list is gona change Iterator is prefarable
              /* Iterator<String > car= cars.iterator();
          while(car.hasNext()){
              String name=car.next();
              if(name.toLowerCase().endsWith("a")){
                  car.remove();
              }
          }
        System.out.println(cars);

               */
       /* for (int i = 0; i < cars.size(); i++) {
            String name=cars.get(i);
            if(name.toLowerCase().endsWith("i")){
                cars.remove(i);
            }

        }
        System.out.println(cars);
        for (int i = 0; i < cars.size(); i++) {
            String name=cars.get(i);
            if(name.toLowerCase().contains("a")){
                cars.set(i,(name.replace("a","")));
            }

        }
        System.out.println(cars);

        */
       /* ArrayList <Integer > num=new ArrayList<>() ;
        num.add(2);
        num.add(3);
        num.add(1);
        num.add(5);
        System.out.println(num.contains(2));

        */
       /* Map<Integer,String> num=new HashMap<>();
        num.put(1,"snobar");
        num.put(2,"rabonas");
        num.put(3,"Suga");
        num.put(4,"Jimin");
        System.out.println(num.get(4));

        */
        //  Normally the conversion of int into double is normal and it does not give any error but it will give error in Wrapper classes
      /*   HashMap<Integer,String> num=new HashMap<>();
        num.put(1,"Jin");
        num.put(2,"Suga");
        num.put(3,"Jhope");
        HashMap<Integer,String> num2=new HashMap<>();
        num2.put(4,"RM");
        num2.put(5,"jimin");
        num2.put(6,"V");
        num2.put(7,"JK");
       /* HashMap<Integer,String> num3=new HashMap<>();
        num3.putAll(num);
        num3.putAll(num2);
        System.out.println(num3);

        */
      /*  TreeMap<Integer,String> num3=new TreeMap<>();
        num3.putAll(num);
        num3.putAll(num2);
        System.out.println(num3);
        */

       /* System.out.println(num.get("Jin"));
        System.out.println(num.get(1));
        System.out.println(num.containsValue("JK"));
        System.out.println(num.containsKey(7));
        System.out.println(num.remove(7));
        System.out.println(num);
        System.out.println(num.remove(1,"Jin"));
        System.out.println(num);
        System.out.println(num.isEmpty());
        System.out.println(num.replace(2,"JIN"));

        */
      /* ArrayList< String> car=new ArrayList<>();
       car.add("honda");
       car.add("civic");
       car.add("londa");
       for(int i=0;i<car.size();i++){
           if(car.get(i).toLowerCase().replaceAll("[an]","").length()<car.get(i).length()){
                   car.set(i,"water");
           }
       }
        System.out.println(car);

       for(int i=0;i<car.size();i++){
           if(car.get(i).toLowerCase().contains("a")){
               car.set(i,"rabonas");
           }
       }
        System.out.println(car);

       */
      /*  ArrayList<Integer> car=new ArrayList<>();
        for (int i = 2; i < 20; i=i+2) {
            car.add(i);
        }
        System.out.println(car);


       // ArrayList<Integer> num=new ArrayList<>();
        Iterator<Integer> num2=car.iterator();

            while (num2.hasNext()){
                Integer num3=num2.next();
                if(num3%5==0){
                    num2.remove();
                }
            }


        System.out.print(car);

       */







           /*   ArrayList<String > list=new ArrayList<>();
              list.add("rabonAs");
              list.add("rabonAs");
              list.add("sanobar");
              list.add("suga");
             // Set<String> newlist=new LinkedHashSet<>(list);
             // System.out.println(newlist);
              Iterator<String> remova=list.iterator();
              while(remova.hasNext()){
                  String avomer= remova.next();
                  if(avomer.startsWith("r")){
                      remova.remove();
                  }
              }
        System.out.println(list);

            */


           /*   HashMap<String,Integer> things=new LinkedHashMap<>();
               things.put("bottle",1);
               things.put("nailcutter",2);
               Set<String> key=things.keySet();
               System.out.println(key);
               Collection<Integer> value=things.values();
               System.out.println(value);

            */


        HashMap<String,Integer> list=new LinkedHashMap<>();
        list.put("snobar",1);
        list.put("rbonas",2);
        list.put("Suga",3);
        list.put("jin",4);
        Iterator<String> listesult=list.keySet().iterator();
        while (listesult.hasNext()){
            String normal=listesult.next();
            if(normal.contains("j")){
                listesult.remove();
            }
        }
        System.out.println(list);





































































































    }
}























