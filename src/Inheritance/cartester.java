package Inheritance;

public class cartester {

    public static void main(String[] args) {
        car[] cars={new car(),new bmw(),new lamda() };


        for (car allcars:cars
             ) {
            allcars.start();
            allcars.park();
            allcars.stop();
        }

    }
}
