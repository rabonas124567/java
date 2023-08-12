package TypesOfVariable;

public class snobar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         snobar dog1=new snobar();
         dog1.name="casper";
         dog1.breed="baflo";
//  dog1.leg=5;
         dog1.sleeping();
       
         snobar dog2=new snobar();
         dog2.name="nobody";
         dog2.breed="nothing";
         dog2.sleeping();
//We can also call the static variable by mentioning with the object name
        // System.out.println(snobar.leg);
System.out.println("----------------------------------------------------");
        snobar person1=new snobar();
        person1.name="snobar";
        person1.salary=23000;
        person1.employeid="123";
System.out.println("----------------------------------------------------");
      System.out.println(person1.CEO);
     // System.out.println(snobar.CEO);
 System.out.println(person1.name+" has the "+person1.employeid+"ID  with the "+person1.salary+" salary");     
 System.out.println("----------------------------------------------------");  
           snobar student=new snobar();
           student.studentname="snobar";
           student.ID="123";
           student.studentnumber++;
  System.out.println(student.studentnumber+":"+student.studentname+student.ID) ; 
           snobar student1=new snobar();
           student1.studentname="rabonas";
           student1.ID="354";
           student1.studentnumber++;
System.out.println(student1.studentnumber+":"+student1.studentname+student1.ID) ;
           snobar student2=new snobar();
           student2.studentname="suga";
           student2.ID="123";
           student2.studentnumber++;
System.out.println(student2.studentnumber+":"+student2.studentname+student2.ID) ;
System.out.println("----------------------------------------------------"); 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	}

}
