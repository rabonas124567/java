package class29;

public class MapExample4 {

    private String name;
    private String lastname;
    private int age;
    private  double salary;

    public MapExample4(String name, String lastname, int age, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }
    public void printall(){
        System.out.println(name+"  "+lastname+"  "+age+"  "+salary);
    }
}
