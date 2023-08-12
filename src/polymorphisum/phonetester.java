package polymorphisum;

public class phonetester {
    public static void main(String[] args) {
      /*  phone phone1=new phone(200);
        phone1.calculateinterest();
        AX AX1=new AX(200);
        AX1.calculateinterest();
        visa visa1=new visa(200);
        visa1.calculateinterest();

       */

    phone[] phone2={new phone(1),new AX(2),new visa(3)};
        for (phone phone3:phone2
             ) {
            phone3.calculateinterest();
            if(phone3 instanceof visa){
                ((visa)phone3).please();
            }

        }




    }

}
