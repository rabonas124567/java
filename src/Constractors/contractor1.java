package Constractors;

public class contractor1 {
       
     /*   private String name;
        private String breed;
        private int age;
        private String color;
        private int weight;
  contractor1 (String dogname,String dogbreed,int dogage,
		  String dogcolor,int dogweight){
	  System.out.println("I will go first");
	  System.out.println(dogname);
	  name=dogname;
	  breed=dogbreed;
	  color=dogcolor;
	  weight=dogweight;
	  age=dogage;
        }
  public void dogname() {
	  System.out.println(name);
  }
  public void dogbreed() {
	  System.out.println(breed);
  } 
  public void dogage() {
	  System.out.println(age);
  } 
  public void dogcolor() {
	  System.out.println(color);
  } 
  public void dogweight() {
	  System.out.println(weight);
  }*/
	
/*	private String name;
	private String color;
	private String maker;
	private double price;
	contractor1(){
		
	}
	contractor1(String carname){
		name=carname;
		System.out.println(name);
	}
	contractor1(String carname,String carcolor,
			String carmaker,double carprice){
		name=carname;
		color=carcolor;
		maker=carmaker;
		price=carprice;
	}
	public void carname() {
		System.out.println(name);
	}
	public void carcolor() {
		System.out.println(color);
	}
	public void carmaker() {
		System.out.println(maker);
	}
	public void carprice() {
		System.out.println(price);
	}
	public void simplename() {
		System.out.println("rabonas");
	}
	*/
	/*private String name;
    private String breed;
    private int age;
    private String color;
    private int weight;
    public contractor1() {
		
	}
    public contractor1(String name) {
		this.name = name;
		System.out.println(name);//in case of calling one or two constractor
//you can system out like this.and then call the constractor.
	}
    public contractor1(String name, String breed) {
		this(name);
		this.breed = breed;
	}
    public contractor1(String name, String breed, int age) {
		this(name,breed);
		this.age = age;
	}
    public contractor1(String name, String breed, int age, String color) {
		this(name,breed,age);
		this.color = color;
	}
	
	public contractor1(String name, String breed,
			int age, String color, int weight) {
		/*You can initialize all the feilds by right
		 * click on the screen anywhere the go to 
		 * source and then to "Gennerate constractor
		 * using fields". 
		 */
		/*this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
		this.weight = weight;*/
		/*this(name,breed,age,color);
		this.weight=weight;
	}
	public void printlnAll() {
		System.out.println(name+" "+breed+" "+age+" "+color+" "+weight);
	}*/
	private String name;
	private double f;
	private double s;
	private double t;
	public contractor1(String name, double f,
			double s, double t) {
	    this.name = name;
		this.f = f;
		this.s = s;
		this.t = t;
	}
	public void marks () {
		System.out.println((f+s+t)/3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
        

}
