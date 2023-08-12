package Abstract;

public class papertester {
    public static void main(String[] args) {
        paper[] paper1={new A(99,99,99),new B(99,99,99)};
        for (paper paper2:paper1
             ) {
            System.out.println(paper2.percentage());
        }
    }

}
