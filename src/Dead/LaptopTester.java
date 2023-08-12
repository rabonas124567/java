package Dead;

public class LaptopTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		laptop snobar=new laptop();
		snobar.color ="black";
		snobar.model="hp";
		snobar.ram=1213;
		snobar.rom=132;
		snobar.name="snobar";
		System.out.println("The colour of laptop is "+snobar.color);
		System.out.println("The model of  laptop is "+snobar.model);
		System.out.println("The ram of laptop is "+snobar.ram);
		System.out.println("The rom of laptop is "+snobar.rom);
		System.out.println("The name of laptop is "+snobar.name);
		snobar.performance();
		snobar.sound();
	}

}
