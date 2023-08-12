package Abstract;

public interface math {
    void Area(double a);
    void Perimeter(double b);
}
class square implements math{
        double length=4;
    @Override
    public void Area(double a) {
        System.out.println("Area is "+(a*a));
    }

    @Override
    public void Perimeter(double b) {
        System.out.println("PERIMETER IS "+length*b);
    }
}
class circle implements math{
    double length=5;
    @Override
    public void Area(double a) {
        System.out.println("Area is "+(a/a));
    }

    @Override
    public void Perimeter(double b) {
       // System.out.println(b*length);
        System.out.println("PERIMETER IS "+(change(2*b/length,2)));
    }
    static double change(double value,int decimalpoint){
        //using the pow() ethod
        value=value *Math.pow(10,decimalpoint);
        value=Math.floor(value);
        value=value/Math.pow(10,decimalpoint);
        System.out.println(value);
        return value;
    }


}
