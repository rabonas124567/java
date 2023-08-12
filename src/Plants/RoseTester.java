package Plants;

public class RoseTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose daffodels=new Rose();
		daffodels.name="Rose";
		daffodels.color="blue";
		daffodels.height=3;
		daffodels.location="In daffodels";
		System.out.println("-------------------------------------");
		System.out.println("My name is  "+daffodels.name);
		System.out.println("My color is  "+daffodels.color);
		System.out.println("My height is  "+daffodels.height);
		System.out.println("My location is  "+daffodels.location);
		System.out.println("-------------------------------------");
		daffodels.life(3);
		System.out.println("-------------------------------------");
		daffodels.repeatcolor("red",6);
		System.out.println("-------------------------------------");
		daffodels.conditions("Yelllow",true);
		
		
		
		
		
		
		
		
		
		

	}

}
