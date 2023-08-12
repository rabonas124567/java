package Abstract;

public abstract class cars {
    String name;
    static int num;

    public cars(String name) {
        this.name = name;


    }
    abstract void start();
    abstract void park();
    abstract void stop();
    void numofcars(){
        num++;
        System.out.println(num+" car of the program");
    }

}
 class honda extends cars{//This class will give the error untill the all abstract method of the parent class are not used
   String color;
   double vin_num;

    public honda(String name,String color, double vin_num) {
        super(name);
        this.color=color;
        this.vin_num=vin_num;

    }
     void numofcars(){
         num++;
         System.out.println(num+" car of the program");
     }
     void start(){
        System.out.println(name+" "+ color +" Start wit the keys");
    }
     void park(){
         System.out.println(name+" with  the vin_num"+vin_num+"park wit the keys");
    }
     void stop(){
         System.out.println(name+"Stop wit the keys");
     }

}
class Civic extends cars{
    public Civic(String name) {
        super(name);

    }
    void numofcars(){
        num++;
        System.out.println(num+" car of the program");
    }
    void start(){
        System.out.println(name+"Start wit the keys");
    }
    void park(){
        System.out.println(name+"park wit the keys");
    }
    void stop(){
        System.out.println(name+"Stop wit the keys");
    }

}
