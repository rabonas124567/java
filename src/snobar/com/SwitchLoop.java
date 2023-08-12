package snobar.com;

import java.util.Scanner;

public class SwitchLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner input=new Scanner(System.in);
		System.out.println("Please enter the number to see the day name");
		int day=input.nextInt();
         switch (day) {
         case 1:
        	 System.out.println("MONDAY");
        	 break;
         case 2:
        	 System.out.println("TUESDAY");
        	 break;
         case 3:
        	 System.out.println("WEDNESDAY");
        	 break;
         case 4:	 
        	 System.out.println("THURDAY");
        	 break;
         case 5:	 
        	 System.out.println("FRIDAY");
        	 break;
         case 6: 
        	 System.out.println("SATURDAY");
        	 break;
         case 7: 
        	 System.out.println("SUNDAY");
        	 break;
        default:
        	 System.out.println("WRONG DAY");
        	 break;	 
        	 }*/
	/*	Scanner input=new Scanner(System.in);
		char gender=input.next().charAt(0);
        switch(gender) {
        case 'f':
        	System.out.println("Female");
        	break;
        case 'm':
        	System.out.println("male");
        	break;
        case 'F':
        	System.out.println("Female");
        	break;
        case 'M':
        	System.out.println("male");
        	break;
        default:
        	System.out.println("Unknown");
        	
        }
        */
/*		Scanner input=new Scanner(System.in);
		String country=input.next();
		
		switch(country.toUpperCase()) {
		case "ENGLAND":
		case "USA":
		case "AUSTRALIA":
		case "GERMANY":	
			System.out.println("English");
			System.out.println("They like Burger");
			break;
		case "ARAB":
		case "AFRICA":
			System.out.println("Arabi");
			System.out.println("They like Kebab");
			break;
		case "PAKISTAN":
			System.out.println("Urdu");
			System.out.println("They like Biryani");
			break;
		default:
			System.out.println("Try another country");
		}
		*/
//While loop:
//Task 1:
		
	/*	int time=14;
		while(time<=17) {
			System.out.println("Snpbar");
			time++;
		}*/
//Task 2:
	/*	int num=0;
		while(num<=20) {
			System.out.print(num+" ");
			num+=2;
		}*/
//Task 3:
		/*int num=1;
		while(num<=20) {
			System.out.print(num+" ");
			num+=2;
		}*/
//Task4:		
	/*	int num=20;
		while(num>=1) {
			System.out.print(num+" ");
			num-=1;}
	*/
//Task 5:
		/*int num=1;
		while(num<=20) {
			if(num%2==0) {
			System.out.print(num+" ");
			}
			num+=1;}*/
//Task 6:
		/*int num=1;
		while(num<=20) {
			if(num%2==1) {
			System.out.print(num+" ");
			}
			num+=1;}
		*/
//Task 7:
		/*	Scanner input=new Scanner(System.in);
		int num=1;
		System.out.println("Enter the number for table");
		int in=input.nextInt();
        System.out.println("Print the table of "+in);
		while(num<=10) 
			{
			
			System.out.print(num*in+" ");
			num+=1;
			}
			*/
	/*	Scanner input=new Scanner (System.in);
		int secretnumber=7;
		int enternumber;
	
		do {
			System.out.println("please enter the number that you gussed");
			enternumber=input.nextInt();
	       }while (enternumber!=secretnumber);
		{
			System.out.println("You have gused the number");
		}
		*/
	/*Scanner input=new Scanner (System.in);
		double themoneyyouhave;
		double price;
		System.out.println("which thing you want to buy");
		String thing=input.next();
		
		do {     
			       System.out.println("Enter the price of "+ thing);
	               price=input.nextDouble();
	              
	               System.out.println("Enter the money you have for "+thing);
	               themoneyyouhave=input.nextDouble();
	               double remainingmoney=0;
	
		if(themoneyyouhave>=price) {
			remainingmoney=themoneyyouhave-price;
			System.out.println( "The remaining money is "+ remainingmoney);
			break;
			
		}else if(themoneyyouhave<price) {
			System.out.println("You have less money please pay more");
		}
	  }while (themoneyyouhave!=price);{
		  System.out.println("YOU HAVE PAIND THE FULL MONEY");
	  }*/
	  Scanner input=new Scanner (System.in);
		double themoneyyouhave;
		double price;
		System.out.println("which thing you want to buy");
		String thing=input.next();
		double equal;
		do {     
			       System.out.println("Enter the price of "+ thing);
	               price=input.nextDouble();
	               equal=price;
	               System.out.println("Enter the money you have for "+thing);
	               themoneyyouhave=input.nextDouble();
	               double remainingmoney=0;
	
		if(equal>=themoneyyouhave) {
			remainingmoney=themoneyyouhave-price;
			System.out.println( "The remaining money is "+ remainingmoney);
			
			
		}else if(equal<themoneyyouhave) {
			System.out.println("You have less money please pay more");
		}
	  }while (equal!=themoneyyouhave);{
		  System.out.println("YOU HAVE PAIND THE FULL MONEY");
	  }
		
	 }

}
