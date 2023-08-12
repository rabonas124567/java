package Inheritance;

public class ahemat {
    String name;

     ahemat(String name) {
        this.name = name;
    }
void eat()
{
    System.out.println(name+"Ahemat eats a lot");
}
void sleep(){
    System.out.println(name+"And he sleep also a lot");
}
}
class saeed1 extends ahemat {

    saeed1(String name) {
        super(name);

    }
    void eat()
    {
        System.out.println(name+" eats a lot");
    }
    void sleep(){
        System.out.println(name+"And he sleep for 3 hours a lot");
    }
}
class saeed3 extends ahemat{

    public saeed3(String name) {
        super(name);
    }
    void eat()
    {
        System.out.println(name+" eats kebab a lot a lot");
    }
    void sleep(){
        System.out.println(name+"And he sleep for 4hours a lot");
    }
    void work(){
        System.out.println(name+" he also work");
    }
}
