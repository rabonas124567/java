package Animals;

public class Dog {
	/*you have to create here the datatype with variable name only:
	 * Exp:
	 * String type;
	 * these are the characteristic which you call in another class with the main method
	 * do not create main method here.
	 * Store also the behaviours here in the form of:
	 *   Exp:          void move (){
		System.out.println(name+" moves round and round");
	}
	 */
	String name;
	String type;
	String nickname;
	double weight;
	int age;
	double height;
	String habit="crying";
	static int nooflegs=4;
	void move (){
		System.out.println(name+" moves round and round");
	}
	void habit (){
       System.out.println(name+" most adorable habit is "+habit);
	}
	void runing(){
//You can  call a static variable in the  void method
      System.out.println(nooflegs);  //allowed
		 System.out.println(name+" run very fast ");
	}
	static void leg() {
//You can call a static variable in the static void method 
//You cannot call a intanteneous variable in the static void method 
//		System.out.println(name);      not allowed
		System.out.println(nooflegs);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
