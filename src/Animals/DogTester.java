package Animals;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog snobar=new Dog();
		snobar.name="kitty";
		snobar.type="Kutta";
		snobar.nickname="nothing";
		snobar.age=16;
		snobar.height=1.5;

		System.out.println("name of dog is "+snobar.name);
		System.out.println("type of dog is "+snobar.type);
		System.out.println("nickname of dog is "+snobar.nickname);
		System.out.println("age of dog is "+snobar.age);
		System.out.println("height of dog is "+snobar.height);
		System.out.println("--------------------------------------------- ");
		snobar.move();
		snobar.habit();
		snobar.runing();
System.out.println(Dog.nooflegs);
	
	}

}
