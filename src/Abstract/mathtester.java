package Abstract;

public interface mathtester {
    public static void main(String[] args) {
        square square1 = new square();
        square1.Area(4);
        square1.Perimeter(3);
        circle circle1 = new circle();
        circle1.Area(4);
        circle1.Perimeter(3);
        System.out.println("-----------------------------------");
        math[] square2={new square(),new circle()};
        for (math math1:square2
             ) {
            math1.Area(4);
            math1.Perimeter(3);

        }


    }
}
