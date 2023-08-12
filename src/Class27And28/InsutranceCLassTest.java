package Class27And28;

import java.util.ArrayList;

public class InsutranceCLassTest {
    public static void main(String[] args) {
        ArrayList<Insurance> InsuranceList=new ArrayList<>();
        CAR car=new CAR("TATA","Tesla");
        PET pet=new PET("TATA","Australian");
        HEALTH health=new HEALTH("TATA");
        InsuranceList.add(car);
        InsuranceList.add(pet);
        InsuranceList.add(health);
        for (Insurance getmethod:InsuranceList
             ) {
            getmethod.getQuote();
            getmethod.cancelInsurance();
        }

    }
}
