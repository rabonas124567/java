package polymorphisum;

public class Finalkeyword {     // They can be used with the class
    final double  GRAVITY=9.8;// They can be used with the variables
    public final int NAME=12;
    protected final String  NAME1="snobar";
     final double NAME2=12;
     final  static int NAME3=12; //The  name of box in which we are storing it allways is in capital

   protected final void printgravity(){
        System.out.println(GRAVITY);

    }
    private final void NAME(){
        System.out.println(GRAVITY);

    }
   public  final void NAME3(){
        System.out.println(GRAVITY);

    }
    final  void NAME2(){         // They can be used with the methods
         System.out.println(GRAVITY); // The final keyword is used for the constant values of the things . they cannot be changed again and again.

    }


    public static void main(String[] args) {
        Finalkeyword Finalkeyword1=new Finalkeyword();
        Finalkeyword1.printgravity();
    }
}



