package Class27And28;

public abstract class Insurance {
    String insuranceName;
    public Insurance(String insuranceName){
         this.insuranceName=insuranceName;
    }
    public abstract void getQuote ();
    public abstract void cancelInsurance ();
}
class CAR extends Insurance{
      String carmodel;
    public CAR(String insuranceName,String carmodel) {
        super(insuranceName);
        this.carmodel=carmodel;
    }

    @Override
    public void getQuote() {
        System.out.println("get a quote for carmodel  "+carmodel+" from "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("cancel the insurance for carmodel "+carmodel+" from "+insuranceName);
    }

}
class PET extends Insurance{
        String pettype;
    public PET(String insuranceName, String pettype) {
        super(insuranceName);
        this.pettype=pettype;
    }

    @Override
    public void getQuote() {
        System.out.println("get a quote for pettype  "+pettype+" from "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("cancel the insurance for pettype "+pettype+" from "+insuranceName);
    }
}
class HEALTH extends Insurance{

    public HEALTH(String insuranceName) {
        super(insuranceName);
    }

    @Override
    public void getQuote() {
        System.out.println("get a quote for"+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel Insurance from the"+insuranceName);
    }
}









