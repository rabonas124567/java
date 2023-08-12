package AcessModifier;

public class modifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		modifier1 check1=new modifier1();
//check1.name="snobar";not allowed private variable in other class
		//check1.company="syntax";//public variable available in other class
		//check1.age=20;         //default variable available in other class
		//check1.limited(); //static void method available in other class
		//check1.name3();   //default void method available in other class
		//check1.name2(); //public void method available in other class
//check1.name1();not allowed its private void method
		/*
		 * The private and default variable and methods are also not 
		 * available in another packages.
		 */
		//check1.USERNAME("snobar")
		//	check1.PASWORD("snobar");
		//	check1.Balance("snobar","snobar");
		//check1.Name("snobar");
		modifier1 name2=new modifier1();
        System.out.println(name2.reverse("snobar"));
      
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
