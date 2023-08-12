package Class27And28;

import java.util.ArrayList;
import java.util.LinkedList;

public class CreditcardTest {
    public static void main(String[] args) {
      /*  ArrayList<Creditcard> creditcardlist=new ArrayList<>();
        SIMPLECARD simplecard=new SIMPLECARD("SIMPLECARD");
        DEBITCARD debitcard=new DEBITCARD("DEBITCARD");
        PREPAIDCARD prepaidcard=new PREPAIDCARD("PREPAIDCARD");
        creditcardlist.add(simplecard);
        creditcardlist.add(debitcard);
        creditcardlist.add(prepaidcard);
        for (Creditcard getmethod:creditcardlist
             ) {
            getmethod.interest();
        }
    }

       */
        LinkedList<Creditcard> creditcardlist=new LinkedList<>();
        creditcardlist.add(new SIMPLECARD("SIMPLECARD") );
        creditcardlist.add(new DEBITCARD("DEBITCARD") );
        creditcardlist.add(new PREPAIDCARD("PREPAIDCARD") );
        for (Creditcard getmethod:creditcardlist
        ) {
            getmethod.issuecard();
            getmethod.interest();
        }
    }

}
