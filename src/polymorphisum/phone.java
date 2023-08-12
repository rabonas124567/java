package polymorphisum;

public class phone {
    double interest;
    double balance;

    public phone( double balance) {

        this.balance = balance;

    }
    void calculateinterest(){
        interest=balance*10;
        System.out.println(interest);
        System.out.println(balance);
    }
}
class AX extends phone{
    public AX( double balance) {
        super( balance);
    }
    void calculateinterest(){
        interest=balance*20;
        System.out.println(interest);
        System.out.println(balance);
    }
}
class visa extends phone{
    public visa( double balance) {
        super( balance);
    }
    void calculateinterest(){
        interest=balance*30;
        System.out.println(interest);
        System.out.println(balance);
    }
    void please(){
        System.out.println("shit");
    }
}









