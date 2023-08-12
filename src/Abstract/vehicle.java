package Abstract;

public interface vehicle {
    void start();
    default void stop() { }
    static void stop1() {
        System.out.println("stop1 from vehicle");
    }



    /*final void stop2(){
         final not allowed
    }

     */
   /* public void stop2(){
        public not allowed
    }

    */
}



interface vehicle2{

     String name="tesla";
    static void park(){
        System.out.println(name+"park automatically");
    }

}






class  Bike implements  vehicle,vehicle2{
    @Override
    public void start()
    { System.out.println("Start with the keys"); }

    static void stop1()
    { System.out.println("stop1 from vehicle"); }

    static void park(){
        System.out.println(name+"park automatically");
    }

   /* default void stop(){
   only be used in the interface class
    }

    */
}
class  car implements  vehicle{


    @Override
    public void start() {
        System.out.println("Start with the keys");
    }
    static void stop1()
    { System.out.println("stop1 from vehicle"); }

    static void park()
    { System.out.println("final,public not allowed"); }
}
