package class29;

import java.util.ArrayList;

public class MapExample2 {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(10);
        num.add(10);
        int sum=0;
        for (Integer number:num
             ) {
          sum=sum+number;

        }
        System.out.println( sum);
    }
}
