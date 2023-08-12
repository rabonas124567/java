package AcessModifier;

public class modifier1 {
/*	private String name;
	public String company;
	int age;
	private void name1() {
		System.out.println(name);
		System.out.println(company);
		System.out.println(age);
		
	}
	public void name2() {
		System.out.println(name);
		System.out.println(company);
		System.out.println(age);
	}
		void name3() {
			System.out.println(name);
			System.out.println(company);
			System.out.println(age);
		}
	static void limited() {
		//System.out.println(name); not allowed
		//System.out.println(company);not allowed
		//System.out.println(age);not allowed
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		modifier1 check=new modifier1();
		check.name="snobar";   //allowed
		check.company="syntax";//allowed
		check.age=20;          //allowed
		check.limited();       //allowed
		check.name3();         //allowed
		check.name2();         //allowed
		check.name1();         //allowed
	}
	*/
	/*private String username;
	private String password;
	private double balance=12000;
	    public void  USERNAME (String userName) {
	    	if(userName.length()<16) {
	    		username=userName;
	    	}else {
	    		System.out.println("Invalid username");
	    	}
	    }
	    public void  PASWORD (String Password) {
	    	if(Password.length()<16) {
	    		password=Password;
	    	}else {
	    		System.out.println("invalid pasword");
	    	}
	    }
	    
	public void Balance(String userName,String Password) {
		if(username.equals(userName)&&password.equals(Password)) {
			System.out.println("The balance is "+balance);
		}
	}*/
	/* public static String reverse(String name) {
     	StringBuilder str=new StringBuilder(name);
     	str.reverse();
     	String namee=str.toString();
     	return namee;
	 }*/
	 public static String reverse(String name) {
	     	String namee=name.replaceAll("[^aeiou]","");
	     	
	     	return namee;
		 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
