package Inheritance;

public class uni {
    void study(){
        System.out.println("please study");
    }
    void homework(){
        System.out.println("please do homework");
    }
    void practice(){
        System.out.println("please practice");
    }
}
class sytax extends uni{
    void study(){
        System.out.println("please study sytax");
    }
    void homework(){
        System.out.println("please do homework sytax");
    }
    void bad(){
        System.out.println("please practice sytax");
    }
}class sytaxrabonas extends uni{
    void study(){
        System.out.println("please study sytaxrabonas");
    }
    void homework(){
        System.out.println("please do homework sytaxrabonas");
    }
    void good(){
        System.out.println("please practice sytaxrabonas");
    }
}
