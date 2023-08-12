package polymorphisum;

public class computer {
    String name;

    public computer(String name) {
        this.name = name;
    }

    void special(){
        System.out.println(name+" Its simply a computer");

    }
}class Apple extends computer{
    public Apple(String name) {
        super(name);
    }
    void special(){
        System.out.println(name+" Its simply a computer");

    }
    void cost(){
        System.out.println("they are expensive");
    }
}
class lenova extends computer{
    public lenova(String name) {
        super(name);
    }
    void special(){
        System.out.println(name+" Its simply a computer");

    }
    void accessaries(){
        System.out.println("theirn  accessaries are most widely used ");
    }
}
class samsawg extends computer{
    public samsawg(String name) {
        super(name);
    }
    void special(){
        System.out.println(name+" Its simply a computer");

    }
    void machine(){
        System.out.println("theirn  machine are most widely used ");
    }

}

