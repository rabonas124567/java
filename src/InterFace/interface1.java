package InterFace;

public interface interface1 {
    void open();
    void close();
    String getTitle();
}
interface screenshot extends interface1{
    void takescreenshot();
}

class chromeDriver implements screenshot{

    @Override
    public void open() {
        System.out.println("This is chromeDriver open it");
    }

    @Override
    public void close() {
        System.out.println("This is chromeDriver claose it");
    }

    @Override
    public String getTitle() {
        return "chromeDriver";
    }

    @Override
    public void takescreenshot() {
        System.out.println("This is chromeDriver Take a screenshot");
    }
    void different(){
        System.out.println("I AM DIFFERENT  BECAUSE I AM GOOGLE");
    }
}
class safari extends chromeDriver{

    @Override
    public void open() {
        System.out.println("This is safari OPEN IT");
    }

    @Override
    public void close() {
        System.out.println("This is safari CLOSE IT");
    }

    @Override
    public String getTitle() {
        return "safari";
    }

    @Override
    public void takescreenshot() {
        System.out.println("This is safari Take a screenshot");
    }
    void different2(){
        System.out.println("I AM DIFFERENT  BECAUSE I AM SAFARI");
    }
}
