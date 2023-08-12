package Class27And28;

public abstract class Creditcard {
    String cardtype;
    public Creditcard( String cardtype){
        this.cardtype=cardtype;
    }
    public void issuecard(){
        System.out.println(cardtype+"Issued");
    }
    public abstract void interest();
}
class SIMPLECARD extends Creditcard{

    public SIMPLECARD(String cardtype) {
        super(cardtype);
    }

    @Override
    public void interest() {
        System.out.println("10% interest"+cardtype);
    }
}
class DEBITCARD extends Creditcard{

    public DEBITCARD(String cardtype) {
        super(cardtype);
    }

    @Override
    public void interest() {
        System.out.println("20% interest"+cardtype);
    }
}
class PREPAIDCARD extends Creditcard{

    public PREPAIDCARD(String cardtype) {
        super(cardtype);
    }

    @Override
    public void interest() {
        System.out.println("30% interest"+cardtype);
    }
}
