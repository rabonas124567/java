package snobar.com;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Simple true false condition other operators ==;>;<;>=;<=;!=.
	/*	int a=10;
		int b=20;
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
// simple if else  conditions.
		if(a>b) {
			System.out.println("Then the value stored in 'a' is greater than the value of 'b' ");
		}else {
			System.out.println("Then the value stored in 'a' is smaller than the value of 'b' ");
		}
// But in the comparison of vales stored in the string we use different syntax.
		String c="snobar";
		
		if(c.equals("snobar")) {
			System.out.println("Entered name is correct you are logined ");
		}else {
			System.out.println("Invalid credentials.");
		}
// now with the false information.		
		String d="snobar";
		
		if(d.equals("snobar nar")) {
			System.out.println("Entered name is correct you are logined ");
		}else {
			System.out.println("Invalid credentials.");
		}
	String e="snobar";
		
		if(e==("snobar nar")) {
			System.out.println("Entered name is correct you are logined ");
		}else {
			System.out.println("Invalid credentials.");
		}
	String f="snobar";
		
		if(f!=("snobar nar")) {
			System.out.println("Entered name is correct you are logined ");
		}else {
			System.out.println("Invalid credentials.");
		}*/
//Nested loop 
		int day=7;
		if(day==1) {
			System.out.println("Monday");
		}else if(day==2){
			System.out.println("Tuesday");
	}else if(day==3){
		System.out.println("Wednesday");
}else if(day==4){
	System.out.println("Thursday");
}else if(day==5){
	System.out.println("Friday");
}else if(day==6){
	System.out.println("Saturday");
}else if(day==7){
	System.out.println("Sunday");
}else {
	System.out.println("NOday");
}
	}
}
