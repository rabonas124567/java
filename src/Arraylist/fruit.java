package Arraylist;

import java.util.ArrayList;

public class fruit {
    public static void main(String[] args) {
        ArrayList <fruit1> print=new ArrayList<>();
        print.add(new fruit1());
        print.add(new Apple());
        print.add(new Banana());
        for (fruit1 fruit12:print
             ) {
            fruit12.name();
        }

    }

}
class fruit1 {
    void name(){
        System.out.println("I am fruit1");
    }
}
class Apple extends fruit1{
    void name(){
        System.out.println("I am Apple");
    }
}
class Banana  extends fruit1{
    void name(){
        System.out.println("I am Banana");
    }
}
