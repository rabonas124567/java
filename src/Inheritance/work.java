package Inheritance;

public class work {
    public static void main(String[] args) {
        uni[] study={ new uni(),new sytax(),new sytaxrabonas() };
        for (uni study2:study
             ) {
            study2.study();
            study2.homework();
            study2.practice();
            if(study2 instanceof sytax){
                ((sytax)study2).bad();
            }
            if(study2 instanceof sytaxrabonas){
                ((sytaxrabonas)study2).good();
            }
        }
    }
}
