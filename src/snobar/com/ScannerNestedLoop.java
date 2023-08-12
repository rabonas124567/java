package snobar.com;

import java.util.Scanner;

public class ScannerNestedLoop {
	public static void main(String[] args) { 
/*   For creating special class press ctrl+SHIFT+O 
*    The syntax is:
*    Scanner any name=new Scanner(System.in);
*    int any name=Above selected name.nextInt();
*    In 'next"Data type"();' always write the first alphabet of the  
*    datatype uppercase like int=Int;double=Double.
*Exp:    int age=tag.nextInt();
*    But in the case of stringe there is no need of writing string.
*Exp:    String name=tag.next();
*    But for writting the entire line the syntax will be
*Exp:    String CompleteLine= tag.nextLine();
*        Scanner input=new Scanner(System.in);
*Exp:		char gender=input.next().charAt(0);
*/
///////////////////////////////////////////////////////////////////////////
 //       Scanner tag=new Scanner(System.in);
// Task 1:
       /* System.out.println("please write here a line");     
        String CompleteLine= tag.nextLine();   
        System.out.println(CompleteLine);
        System.out.println("What is your name ?");
        String name=tag.next();
        System.out.println("Please enter your age:");
        int age=tag.nextInt();
        System.out.println(" Name= "+name+" Age= "+ age);
        System.out.println("What you want to buy ?");
        String product=tag.next();
        System.out.println("Here is your "+ product);
        System.out.println("please write here a line");     
        String Line= tag.nextLine();   */ 
 //Task 2:   
     /*   double totalmarks=100;
         System.out.println("Enter your obtanied marks .");
		  int obtaniednumber=tag.nextInt();
		  double persentage=(obtaniednumber/totalmarks)*100;
		  System.out.println("Your persentage  is= "+persentage);
        if(persentage>=80) {
      	  System.out.println("Your grade is= A ");
        }else {
      	  System.out.println("Your grade is below= A");			  
        }*/
// Task 3:

//    Scanner tag=new Scanner(System.in);
    /*    System.out.println("Enter the price for loan");
        int loan=tag.nextInt();
        if(loan<=200000) {
               System.out.println("loan will be given to the customer");
               System.out.println("Enter the rate for the house");
        double rate=tag.nextDouble();
              
         if(rate<4.5) {
        	  System.out.println("you can buya house");
        }else {
        	  System.out.println("you can not buy a house");
               }
               }
        else {
        		  System.out.println("loan will not  be given to the customer");  
        	  }  */ 
// Task 4:
        
  /*     
        System.out.println("Enter the age");
        double age=tag.nextDouble();
        if( age>=18) {
        	
        System.out.println("Enter the weight"); 
        double weight=tag.nextDouble();
         if(weight<=100) {
        		System.out.println("you can give the blood");
        }
        	else {
        		System.out.println("Youcan not givethe bllod");
        	}
        }else {
        	System.out.println("You can not give the blood");
        }
    */    
 //Task 5:  
   /*   Scanner tag=new Scanner (System.in);  
      System.out.println("Enter the boo");
      boolean boo=tag.nextBoolean();
      System.out.println("Enter the character");
      char   cha=tag.next().charAt(0);
      */
//Task 6
	/*	Scanner tag=new Scanner (System.in);
		System.out.println("Enter the years in which worker work");
		double years=tag.nextDouble();
		    if(years>=5) {
		System.out.println("Enter the salary of worker");
		double salary=tag.nextDouble();
			if(salary>50000) {
		System.out.println("The bonus will be 5000");
			}else {
		System.out.println("the bonus will be 3000");	
				  }
		}else {
		System.out.println("Your are not eligible for bonus");
		}   */  
    		
 }
}
