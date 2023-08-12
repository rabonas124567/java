package class29;

import java.util.LinkedHashSet;
import java.util.Set;

public class MapExample5 {
    public static void main(String[] args) {
        Set<String> set=new LinkedHashSet<>();
        set.add("rabonas");
        set.add("suga");
        set.add("snobar");
        StringBuilder str= new StringBuilder();
        for (String getnames:set
             ) {
            str.append(getnames);
        }
        System.out.println(str);
    }
}
