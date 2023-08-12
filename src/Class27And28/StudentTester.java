package Class27And28;

import java.util.HashSet;
import java.util.Set;

public class StudentTester {
    public static void main(String[] args) {
        Set<Student> STUDENTLIST=new HashSet<>();
        STUDENTLIST.add(new Student("snobar","123"));
        STUDENTLIST.add(new Student("rabonas","345"));
        STUDENTLIST.add(new Student("SUGA","987"));
        for (Student list:STUDENTLIST
             ) {
            list.printname();
        }

    }
}
