package inheritance;

public class Father {
	/*
	 * We can not create two constractor with the 
	 * same number of parameters but if we change 
	 * their sequence inside the () we can create 
	 * two constractors of the same number of 
	 * parameter*/
 /*Father(int num,String name){
	   System.out.println(1);
		
	}
   Father(String name,int num){
	   System.out.println(2);
    }*/
	/*Father(){
		   System.out.println(1);
			
		}
   public  Father(String name,int num){
		   System.out.println(2);
	   }
   private  Father(String name,double num){
		   System.out.println(3);
	   }
	protected   Father(String name,char num){
		   System.out.println(4);
	   }

  public static void main(String[] args) {
	  new Father();
	  new Father("snobar",947);
	  new Father("snobar",947.4);
	  new Father("snobar",'A');
	 
  }*/
	String name;
	String color;
	String breed;
	int age;
	void eat() {
		System.out.println(name+"son1 sleep well");
	}
	void sleep() {
		System.out.println(name+"son2 eats well");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 }





