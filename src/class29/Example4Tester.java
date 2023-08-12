package class29;

import java.util.Collection;
import java.util.TreeMap;

public class Example4Tester {
    public static void main(String[] args) {
        TreeMap<Integer,MapExample4> example4treemap=new TreeMap<>();
        MapExample4 person1=new MapExample4("snobar","rabonas",20,1100);
        MapExample4 person2=new MapExample4("rabonas","suga",21,1200);
        MapExample4 person3=new MapExample4("snobar","rabonas",20,1300);
        MapExample4 person4=new MapExample4("snobar","rabonas",20,1400);
        example4treemap.put(10,person1);
        example4treemap.put(20,person2);
        example4treemap.put(30,person3);
        example4treemap.put(40,person4);
        Collection<MapExample4> value=example4treemap.values();
        for (MapExample4 values:value
             ) {
            values.printall();
        }

    }
}
