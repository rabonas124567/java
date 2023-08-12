package Plants;

public class Rose {

     String name;
     String color;
     double height;
     String location;
     void benefits (){
    	 System.out.println("it helps in releasing the stress");
     }
     void life(int times) {
    	 for(int i=0;i<times;i++) {
    	 System.out.println("life is about for 20 days");
     }
     }
   void repeatcolor(String color,int times) {
	   for(int i=0;i<times;i++) {
	   System.out.println(color);
	   }
   }
   void conditions( String color,boolean input ) {
	   if(input) {
		   System.out.println("I like "+color);  
	   }else {
		   System.out.println("I don't like "+color);
	   }
   }
 
}





