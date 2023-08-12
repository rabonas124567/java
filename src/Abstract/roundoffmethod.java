package Abstract;

public class roundoffmethod {

    static double change(double value,int decimalpoint){
      //using the pow() ethod
        value=value *Math.pow(10,decimalpoint);
        value=Math.floor(value);
        value=value/Math.pow(10,decimalpoint);
        System.out.println(value);
        return value;
    }
}
