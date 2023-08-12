package snobar.com;

import java.util.Scanner;

public class ForLoops {
	public static void main(String[] args)
	{
	
//Task 1:	
	/*for(int i=30;i>=20;i--) {
		System.out.println(i+" ");
	}
		for(int k=20;k>=1;k--) {
			if(k%2==0) {
				System.out.println(k+" ");
			}
		}
		for(int j=1;j<=20;j++) {
			if(j%2==1) {
				System.out.println(j+" ");
			}
		}*/
		/*int j=2;
		for(int i=1;i<=10;i++) {
			 System.out.println(j+" * "+i+" = "+i*j);
		}*/
	/*	int sum=0;
		for(int i=1;i<=6;i++) {
			sum+=i;
		}
		System.out.println(sum);*/
	/*	int sum=0;
		for(int i=1;i<=6;i++) {
			sum*=i;
		}
		System.out.println(sum);*/
		/*int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		*/
		/*int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);*/
	/*for(int i=1;i<=10;i++) {
		System.out.println(i);
		if(i==3) {
			break;
		}
	}*/
	/*for(int i=1;i<=10;i++) {
	//You cannot put here && operator	
		if(i==3||i==7) {
			continue;
		}
		System.out.println(i);
	}
	*/	
		
		/*for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}*/
		/*for(int i=1;i<=5;i++){
			for(int j=1;j<=10;j++){
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println("-----------------------------------"); 	
		}
		*/
		/*for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		/*for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1||i==5||j==1||j==5) {
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		*/
		/*	for(int i=1;i<=5;i++) {
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
			/*for(int i=1;i<=5;i++) {
				for(int k=4;k>=i;k--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print(" * ");
				}
				System.out.print("\n");
			}
			*/
		
	/*	 int k,i,j, alpha = 64;
		 for(i=1;i<=4;i++){
			for(j=4;j>=i;j--){
				System.out.print(" ");
		}for(k=1;k<=i;k++) {
		 System.out.print ((char) (alpha + k));
				   		
					   }
				   System.out.print("\n");	
		}
		*/
	/*	Scanner input =new Scanner (System.in);
		int sumeven=0;
		int sumodd=0;
		System.out.println("Please enter the starting piont for the for loop");
		int start=input.nextInt();
		System.out.println("Please enter the ending piont for the for loop");
		int end=input.nextInt();
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				sumeven=i+sumeven;
			}else if(i%2==1) {
				sumodd=i+sumodd;
			}
			
		}
		System.out.println("The sum of even numbers"+sumeven);
		System.out.println("The sum of odd numbers"+sumodd);
		*/
		/*for(int i=0;i<=9;i++) {
			for(int j=0;j<=9;j++) {
				for(int k=0;k<=9;k++) {
					for(int l=0;l<=9;l++) {
						System.out.println(i+""+j+""+k+""+l);	
					}
				}
				
			}
		}
		*/
		String tim=null;
		for(int i=0;i<24;i++) {
			
			for(int j=0;j<=59;j++) {
				if(i<10&&j<10) {
					tim="0"+i+":0"+j;
				}
				
				else if(i>=10&&j<10)  {
					tim= i+":0"+j;
				}
				else if(i<10&&j>=10)  {
					tim= "0"+i+":"+j;
				}else   {
					tim= i+":"+j;
				}
				
	        System.out.println(tim);
			}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
