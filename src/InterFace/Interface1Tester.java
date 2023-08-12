package InterFace;

public interface Interface1Tester {
    public static void main(String[] args) {
        chromeDriver[] ChromeDriver={ new chromeDriver(),new safari()};
        for (chromeDriver chromeDriver1:ChromeDriver
             ) {

            chromeDriver1.open();
            chromeDriver1.close();
            chromeDriver1.getTitle();
            System.out.println(chromeDriver1.getTitle());
            chromeDriver1.takescreenshot();
            if(chromeDriver1 instanceof chromeDriver){
                ((chromeDriver)chromeDriver1).different();
            }
            if(chromeDriver1 instanceof safari){
                ((safari)chromeDriver1).different2();
            }



        }
    }
}
