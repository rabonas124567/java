package Inheritance;

public class googletester {
    public static void main(String[] args) {

        google[] Google={new google(),new safri(),new firfox()};
        for (google websites:Google
             ) {
            websites.open();
            websites.login();
            websites.addcredential();
            websites.download();
            websites.close();

        }
 /*     This method is used to moveout the child from the parent classes.
        google Google2=new firfox();
        firfox Google3=(firfox)Google2;

  */
    }
}
