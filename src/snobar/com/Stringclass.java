package snobar.com;

import java.util.Arrays;
	
public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
	/*	String name="snobar";
//This is for checking the length of string,
		System.out.println(name.length());
		System.out.println(name.startsWith("s"));
		System.out.println(name.endsWith("r"));
		System.out.println(name.contains("s"));
		System.out.println(name.equals("snobar"));
		System.out.println(name.equalsIgnoreCase("SNOBAR"));
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf("r"));
		System.out.println("---------------------------------------------");
		/*if we put any number after character than java start finding the index of that character after that num
		ber*/
      /*  System.out.println(name.indexOf("r"));
        //It will print all character starting from that index. 
        System.out.println(name.substring(3));
      //It will print all character between that index.
        System.out.println(name.substring(3,6));
        System.out.println(name.substring(0,6));
        System.out.println(name.isEmpty());*/
       /* String name2="snobar";
        System.out.println(name2.length());
        System.out.println(name2.isEmpty());
        System.out.println(name2.startsWith("s"));
        System.out.println(name2.endsWith("r"));
        System.out.println(name2.equals("snobar"));
        System.out.println(name2.charAt(0));
        System.out.println(name2.equalsIgnoreCase("SnObAr"));
        System.out.println(name2.indexOf("n"));
        System.out.println(name2.indexOf("r",3));
        System.out.println(name2.substring(0,6));
        System.out.println(name2);
//For removing the spaces in the original location 
        System.out.println(name2.trim());
        String name3="I am snobar";
// Split the sentence on the bases of spaces and give the number of words in the sentence
        System.out.println(name3.split(" ").length);
/*Separate the words in the sentences on the bases of spaces represent them is this form [I, am, snobar].
 * plus you have to create a sparate class for it like Scanner class
 */
       /* System.out.println(Arrays.toString(name3.split(" ")));
//Separate the words of the sentences on the bases of spaces and also give the word of that index.
        System.out.println(name3.split(" ")[1]);*/
		/*Scanner input=new Scanner(System.in);
            String mother="Mary";
            String father="Daniel";
            System.out.println("Plese enter the gender of a baby to know the name");
            String baby=input.next();
            if(baby.equalsIgnoreCase("boy")) {
            	String firstname=father.substring(0,father.length()/2);
            	String secondname=mother.substring(mother.length()/2);
            	System.out.println(firstname+secondname);
            	
            } 
            else if(baby.equalsIgnoreCase("girl")) {
            	String firstname=mother.substring(0,mother.length()/2);
            	String secondname=father.substring(father.length()/2);
            	System.out.println(firstname+secondname);
            }*/
		/*String name4="snoebar";
		if(!name4.isEmpty()&&name4.length()>=3&&name4.length()%2==1) {
			System.out.println(name4.charAt(name4.length()/2));
			
		}*/
		/*String weekday="Sunday";
		
		for(int i=5;i>=0;i--) {
			System.out.print(weekday.charAt(i));;
		}*/
	
		/*String weekday="Sunday";
		String input="";
		for(int i=5;i>=0;i--) {
			input+=weekday.charAt(i);
		}
		System.out.print(input);*/
		//String sentence="I am a girl. And my name is snobar";
//First pattern		
		/*System.out.println(Arrays.toString(sentence.split("[.] ")));
//Second pattern
		String sentence2[]=sentence.split("[.]");
		System.out.println(Arrays.toString(sentence2));
//you can write the separating variable in tow ways 1=("g")	and 2=("[g]").	
		System.out.println("------------------------------------------------------------");
	    System.out.println(Arrays.toString(sentence.split("[g]")));
	    String sentence1[]=sentence.split("g");
	    System.out.println(Arrays.toString(sentence1));
	    System.out.println("------------------------------------------------------------");
	    System.out.println(Arrays.toString(sentence.split("girl")));
/* String sentence4[]=sentence.split("[girl]"); if we write word 'girl' in[] then it work but in the following
*[I am a , , , , . And my name , s snoba] in both pattern so write words without [].
*/	    
	  /*  String sentence4[]=sentence.split("girl");
	    System.out.println(Arrays.toString(sentence4));*/
		//System.out.println(sentence);
// And i can change the content of a variable		
		//sentence="";
	//	System.out.println(sentence.replace("snobar", "bad snobar"));
	/*	String sentence1="Today is tuesday. Today its a good day";
		System.out.println(Arrays.toString(sentence1.split("[.]")));
		String sentence2[]=sentence1.split("[.]");
		System.out.println(Arrays.toString(sentence2));
		
		
		String[] sentence3=sentence1.split("Today");
		for(String r:sentence3) {
			System.out.println(r);
		}
	    */
	    /*The difference between the replaceAll and replace method is that we can give regular expressions in the
	     * replaceAll method not to the replace method.  
	     * String sentence5="jihifuvifd84854087FSHUFDFHKUFK504@@#$$%^%&$$^&$";
	    System.out.println(sentence5.replaceAll("[a-z]",""));
	    System.out.println(sentence5.replaceAll("[A-Z]", ""));
	    System.out.println(sentence5.replaceAll("[0-9]", ""));
	    System.out.println(sentence5.replaceAll("[^A-Za-z0-9]", "="));
	    System.out.println(sentence5.replaceAll("[a-z]","*"));
	    System.out.println(sentence5.replaceAll("[A-Z]", "-"));
	    System.out.println(sentence5.replaceAll("[0-9]", "+"));
	    System.out.println(sentence5);
     System.out.println(sentence5.replaceAll("[a-z]", "*").replaceAll("[A-z]", "-").replaceAll("[0-9]", "+"));
	    String sentence6="This is Snobar and she is great";
	    System.out.println(sentence6.replace("great","greatest").replace("Snobar", "Angelina"));
	    String sentence7="This is This and she is great";
	    System.out.println(sentence7.replaceFirst("This","bad"));
	    */
		/*Write something about String and StringBuilder
		 * String always go to the memory and search for the variable and it will slow down the process.
		 * StringBuilder is best for storing the value of String variable
		String sentence1="";
		for(int i=0;i<5;i++) {
			sentence1=sentence1+i;
		}
	    System.out.println(sentence1);
	    
		StringBuilder sentence2=new StringBuilder();
		for(int i=0;i<5;i++) {
			sentence2.append(i);
		}
	    System.out.println(sentence2);
	    */
	  /*  System.out.println("-----------------------------------------");
	    String sentence6="This is Snobar and she is great";
	    System.out.println(sentence6.replace(" ",""));
	   /* System.out.println(sentence6.reverse()); cannot be done with String class if we want to reverse it
	    * than we have to use StringBuilder class and for this process we convert our String variable to
	      StringBuilder variable */
	   /* StringBuilder sentence7=new StringBuilder(sentence6);
	    sentence7.reverse();
	    System.out.println(sentence7);*/
	    /*Here is another difference between String and StrngBuilder
	       once we make change in String class and print it again then we will be getting the original
	       content in the variable the changes will be limited only that line it does not change the original
	       content but if we make a change in StringBuilder class it change the original content also */
	    //sentence6 is of String class
	   /* System.out.println("-----------------------------------------");
	    System.out.println(sentence6.replace(" ",""));
	    System.out.println(sentence6);
	    System.out.println("-----------------------------------------");
	    //Sentence7 is of StringBuilder class
        System.out.println(sentence7);
        System.out.println("-----------------------------------------");
        //We can also reverse the effect of reverse method.
        sentence7.reverse();
        System.out.println(sentence7);
        //converting StringBuilder to String
        sentence6=sentence7.toString();*/
		/*String sentence5="jihifuvifd84854087FSHUFDFHKUFK504@@#$$%^%&$$^&$";
		System.out.println(sentence5.replaceAll("[^A-Za-z0-9]", "").length());*/
		/*String sentence6="At tea time Every body agress It me I am the problem";
		System.out.println(Arrays.toString(sentence6.split("[.,?]").length()));
		String[] sentence7=sentence6.split(" ");
		for(String word:sentence7) {
			StringBuilder sentence8=new StringBuilder(word);
			sentence8=sentence8.reverse();
			System.out.print(sentence8+" ");
		}*/
		/*String plin="abad";
		StringBuilder sen=new StringBuilder(plin);
		  //System.out.println(sen.reverse());
		if(plin.equals(sen.toString())) {
			System.out.println("it is plindrome");
		}else {
			System.out.println("it is  not plindrome");
		}*/
		//String empty="";
		/*String name1="snobar";
		String name2="Angelina";
		String name3=name1+name2;
		name2=name3.replace(name2,"");
		name1=name3.replace(name1, "");
		System.out.println(name1);
		System.out.println(name2);*/
		String name1="snobar";
		String name2="Angelina";
		 name1=name1+name2;
		name2=name1.replace(name2,"");
		name1=name1.replace(name2, "");
		System.out.println(name1);
		System.out.println(name2);
		/*
		String sentence6="At tea time! Every body agress. It me, I am the problem?";
		System.out.println((sentence6.split("[!.,?]").length));*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
            
            
            
            
            
            
            
        
        
        
	}

}
