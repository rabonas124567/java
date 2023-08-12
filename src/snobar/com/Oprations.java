package snobar.com;

public class Oprations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Performing the all four operation in it.
          int a=10;
          int b=30;
          System.out.println(a+b);
          System.out.println(a-b);
          System.out.println(b/a);
          System.out.println(a*b);
      System.out.println("***********************************************************");
//now we are taking the double data type to get the answer in point form.
          double c=10;
          double d=20;
          System.out.println(c+d);
          System.out.println(c-d);
          System.out.println(c/d);
          System.out.println(c*d);
System.out.println("***********************************************************");   
//In java the things perfom from top to bottom and from left to right.
         String var="Hello";
         int f=10;
         int g=10;
         System.out.println(f+g+var);
         System.out.println(var+f+g);
System.out.println("***********************************************************");
//Finding odd and even with the help of modulas operator or %.
          int h=2;
          int i=3;
          int j=4;
          System.out.println(i%h);
          System.out.println(j%h);
System.out.println("***********************************************************");          
/* Type casting converting the value of one data type into other data type. 
 * 1. now if we are moving from small data type into large data type there in no change in the sytax just assign it to other data type 
 * 2.But if we are moving from large to small then we need a change in the syntax.  
 * double b=10;
 * int a=(int)b;
 * And the the list f the data type is byte-short-integer-long-float-double.
 */
         double k=10;
         int l=(int)k;
         System.out.println(l);
		
		
	}

}
