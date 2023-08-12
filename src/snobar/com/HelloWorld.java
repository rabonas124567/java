package snobar.com;

public class HelloWorld {

	public static void main(String[] args) {
// TODO Auto-generated method stub
/*numeric values to storing the whole numbers 
* there are four types byte, short, long, integer and shirt as the int 
*/
	    byte     alien1 =127;
	    int      alien2 =749374;
	    long     alien3 =849837493;
	    short    alien4 =3848;
/*and for storing the decimal number we used two kind of types of data types.  
* float but we have to put small case (f)at the end of data.
* double where we can put but if we don't then there is no problem
*/
	    float   alien5 =1.38748f;
	    double  alien6 =1.37;
/* for some special character we use char and the ''to put the values  
* and for the true and the false values we the boolean data types
*/
        char      alien7 ='@';
        boolean   alien8 =true;
        System.out.println( alien1);
        System.out.println(alien2);
        System.out.println(alien3);
        System.out.println(alien4);
		System.out.println("**********************************");
		System.out.println(alien5);
		System.out.println(alien6);
		System.out.println("**********************************");
		System.out.println(alien7);
		System.out.println(alien8);
		System.out.println("**********************************");
//right click on the class go to the Refactor and select the rename option for the renaming thing.
//for the multiple characters we use string which is a combination of boolean,integers,the whole whole numbers package
		String name="snobar";
		String adress="KRK";
		int    HouseNO=123;
		boolean statement=true;
		boolean statement2=false;
		System.out.println("My name is  "+name+" and i live in "+adress+" at "+HouseNO+" House number and this is "+statement);
		System.out.println("***********************************");
		String alien9="+992109283982";
		System.out.println(alien9);
//perform the string concetation with integer,double,char,with the boolean.
//+-/* with the integers is possible		
		int alien10=20;
		int alien11=20;
		System.out.println(alien10+alien11);
		System.out.println(alien10-alien11);
		System.out.println(alien10/alien11);
		System.out.println(alien10*alien11);
//+-/* with the double is possible
		double alien12=5.5;
		double alien13=6.5;
		System.out.println(alien12+alien13);
		System.out.println(alien12-alien13);
		System.out.println(alien12/alien13);
		System.out.println(alien12*alien13);
//+-/* is possible between the integer and the double despite their nature of data type.
		System.out.println(alien10+alien12);
		System.out.println(alien10-alien12);
		System.out.println(alien10/alien12);
		System.out.println(alien10*alien12);
//+-/* with the char data type is not possible.
		char alien14='$';
		char alien15='@';
		System.out.println(alien14+alien15);
		System.out.println(alien14-alien15);
		System.out.println(alien14/alien15);
		System.out.println(alien14*alien15);
//% and / with the double data type.
		double alien16=2;
		double alien17=3;
		System.out.println(alien17/alien16);
		System.out.println(alien17%alien16);
		double alien18=3;
		double alien19=4;
		System.out.println(alien18/alien19);
		System.out.println(alien18%alien19);
		System.out.println("*****************************************");
//increase the value  by putting the + sign and the value for the addition with the value name like alien20+2 or any number
		int alien20=15;
//double alien21=15; is also possible it not just take the numbers with the number.
		alien20=alien20+4;
		System.out.println(alien20);
//put the ++ sign for increasing the value by the one
		alien20++;
		System.out.println(alien20);
		alien20=alien20+20+20+20;
		System.out.println(alien20);
		alien20=alien20-40;
		System.out.println(alien20);
		alien20=alien20/2;
		System.out.println(alien20);
		alien20=alien20*3;
		System.out.println(alien20);
//and for the -- is also possible.
		alien20--;
		System.out.println(alien20);
//** is not allowed
//%% is not allowed
//and // is not allowed
// there are also some other ways for these functions.by putting +-/*=and any value
		double alien21=20;
		alien21+=20;
		System.out.println(alien21);
		alien21-=10;
		System.out.println(alien21);
		alien21/=3;
		System.out.println(alien21);
		alien21*=10;
		System.out.println(alien21);
		alien21%=3;
		System.out.println(alien21);// for the double data type.
		System.out.println("*****************************************************");
				
	}	
		
	}
