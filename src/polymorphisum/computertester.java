package polymorphisum;

public class computertester {
    public static void main(String[] args) {


    computer[] computer1={new computer("old man"),new Apple("Apple"),
    new lenova("Lenova"),new samsawg("BTS")};

        for (computer computer2:computer1
             ) {
            computer2.special();
            if(computer2 instanceof Apple){
                ((Apple)computer2).cost();
            }
            if(computer2 instanceof lenova){
                ((lenova)computer2).accessaries();
            }
            if(computer2 instanceof samsawg){
                ((samsawg)computer2).machine();
            }
        }
    }
}
