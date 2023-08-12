package Inheritance;

public class saeed {
    public static void main(String[] args) {
        ahemat ahemat1=new ahemat("Ahemat1");
        ahemat1.eat();
        ahemat1.sleep();
        saeed1 saeed2=new saeed1("Saeed1");
        saeed2.eat();
        saeed2.sleep();
        saeed3 saeed4=new saeed3("Saeed2");
        saeed4.eat();
        saeed4.sleep();
        System.out.println("------------------------");
        ahemat[] ahemat2={new saeed1("Saeed1"),
                new ahemat("Ahemat1"),new saeed3("Saeed2")};
        for (ahemat sons:ahemat2
             ) {
            sons.sleep();
            sons.eat();

            if(sons instanceof saeed3){
                ((saeed3)sons).work();
            }
        }


       /*  ahemat ahemat1=new ahemat("Ahemat1");
        saeed1 saeed2=(saeed1)ahemat1;*/
    }
}















