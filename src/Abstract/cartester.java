package Abstract;

public class cartester {
    public static void main(String[] args) {
        cars[] cars1={new honda("Honda","Black",12),
                new Civic("civic wala londa") };
        for (cars cars2:cars1
             ) {
            cars2.numofcars();
            cars2.start();
            cars2.park();
            cars2.stop();
        }

    }
}
