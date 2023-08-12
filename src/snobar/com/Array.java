package snobar.com;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args)
	{
		
		
	/*	
		int arr5[];
		arr5=new int[2];
		
		int INT[]= {1,2,3,4};
		//System.out.println(INT.length);
		int second[]=new int[4];
		second[0]=1;
		second[1]=2;
		second[2]=3;
		second[3]=4;
		//changing of value second [3]=4 to second[3]=5;
		System.out.println(second[0]+second[1]+second[2]+second[3]);
		
		
		
		
		
		String arr1[];
	    arr1=new String[2];
		String STRING[]= {"snobar","Nazir","is","Girl"};
		String second2[]= new String[4];
		second2[0]="snobar";
		second2[1]="Nazir";
		second2[2]="is";
		second2[3]="Girl";
		System.out.println(second2[0]+" "+second2[1]+" "+second2[2]+" "+second2[3]);
		
		
		
		char arr3[];
		arr3=new char[2];
		char CHAR[]= {'a','b','c'};	
		char second3[]=new char[4];
		second3[0]='A';
		second3[1]='B';
		second3[2]='C';
		second3[3]='D';
		System.out.println(second3[0]+" "+second3[1]+" "+second3[2]+" "+second3[3]);
		
		
		*//*double arr4[];
		arr4=new double [2];
		double second4[]=new double[4];
		second4[0]=12.2;
		second4[1]=23.4;
		second4[2]=34.5;
		second4[3]=23.4;
		System.out.println(second4[0]+second4[1]+second4[2] +second4[3]);
		*/
		/*int evensum=0;
		int oddsum=0;
		int DOUBLE[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<DOUBLE.length;i++) {
		if(DOUBLE[i]%2==0) {
			evensum=evensum+DOUBLE[i];
			}
		
		else if(DOUBLE[i]%2==1) {
			oddsum=oddsum+DOUBLE[i];
		}
	}
			System.out.println("sum of even numbers="+evensum+"  sum of odd numbers="+oddsum);
	*/
//char num[]; declare an arry
//num= new char[2]; initialize an arry
		
		/*int sum=0;
		int num[]= {1,2,3,4,5};
		System.out.println(num.length);
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);*/
		/*int sum=0;
		Scanner input=new Scanner(System.in);
		int enter[];
		enter=new int[5];
		System.out.println("Enter five integers");
		for(int i=0;i<enter.length;i++) {
			enter[i]=input.nextInt();
			sum=sum+enter[i];
			
		}
		System.out.println("The sum of numbers is "+sum);
		*/
		
		
	/*	int num[];
		num=new int[5];
		Scanner input=new Scanner(System.in);
		int sumeven=0;
		int sumodd=0;
		System.out.println("Enter the 5 elements ");
		for(int i=0;i<num.length;i++) {
			num[i]=input.nextInt();
			if(num[i]%2==0) {
				sumeven=sumeven+num[i];
			}
			else if(num[i]%2==1) {
				sumodd=sumodd+num[i];
			}
			
		}
		System.out.println("The sum of even number: "+sumeven);
		System.out.println("The sum of odd number: "+sumodd);
		*/
	/*	int num[];
		num=new int[5];
		Scanner input=new Scanner(System.in);
		int sumeven=0;
		int sumodd=0;
		System.out.println("Enter the 5 elements ");
		for(int i:num) {
			num[i]=input.nextInt();
			if(num[i]%2==0) {
				sumeven=sumeven+num[i];
			}
			else if(num[i]%2==1) {
				sumodd=sumodd+num[i];
			}
			
		}
		System.out.println("The sum of even number: "+sumeven);
		System.out.println("The sum of odd number: "+sumodd);
		*/
		/*int [] arr=new int[3];
		arr[0]=2;
		arr[1]=5;
		arr[2]=10;
		
		System.out.println(arr[2]+arr[1]);*/
		//int i=0;
		
		/*Scanner input=new Scanner(System.in);
		String [] cars=new String [6];
		System.out.println("Please enter the six cars name");
		for( int i=0;i<=5;i++ ) {
			cars[i]=input.next();
		} for( String i:cars)
		System.out.println(i);
		*/
		/*String []cars=new String[6];
		cars[0]="cdh";
		cars[1]="cdh";
		cars[2]="cdh";
		cars[3]="cdh";
		cars[4]="cdh";
		cars[5]="cdh";
		for(String i:cars) {
			System.out.println(i);
		}
		*/
		/*String [] animals=new String [6];
		Scanner input=new Scanner(System.in);
		System.out.println("Enter five animal name");
		for(int i=0;i<=5;i++) {
			animals[i]=input.next();
		}
		for(String i:animals) {
			System.out.println(i);
		}*/
		
		/*String[] animals= {"aa "+" aaa"+" aaa"+" aaa"+" aaa"+" aaa"};
		for(String i:animals) {
			System.out.println(i+" ");
		}*/
		/*int sum=0;
		Scanner input=new Scanner (System.in);
		int[] num=new int[5];
		System.out.println("Enter 5 numbers");
		for(int i=0;i<=4;i++) {
			num[i]=input.nextInt();
			sum=sum+num[i];
		}
		System.out.println("The sum is "+sum);
		*/
		/*int size=5;
		
		int temp=0;
		int [] num= {-5,-4,3,2,1};
		     for(int i=0;i<=size-1;i++) {
		    	 for(int j=0;j<=(size-i)-2;j++) {
		    		 if(num[j]>num[j+1]) {
		    				temp=num[j];
		    				num[j]=num[j+1];
		    				num[j+1]=temp; 
		    		 }
		    		 
		    	 }
		     }
		     for( int l=0;l<=size-1;l++) {
		    	 System.out.println(num[l]);
		    	 
		     }
		
		*/
	/*	int [] num= {-1,2,13,4,5} ;
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		int secondlargest=Integer.MIN_VALUE;
		for(int i=0;i<=4;i++) {
			if(num[i]>largest) {
				//secondlargest=largest;
				largest=num[i];
				
			}
		}
		for(int i=0;i<=4;i++) {
			if(num[i]<smallest){
				smallest=num[i];
			}
		}for(int i=0;i<=4;i++) {
		  if(num[i]>secondlargest && largest!=num[i]) {
			secondlargest=num[i];
		}
	}
		System.out.println("The largest number is "+largest);
		System.out.println("The smallest number is "+smallest);
		System.out.println("The secondlargest number is "+secondlargest);
		*/
		/*String sentence1="Today is tuesday. A nd its a good day";
		System.out.println(Arrays.toString(sentence1.split("[.]")));*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
