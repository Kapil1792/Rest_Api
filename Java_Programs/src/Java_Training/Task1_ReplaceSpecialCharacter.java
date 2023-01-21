package Java_Training;

public class Task1_ReplaceSpecialCharacter {
public static void main(String[] args) {
	
	String s = "Welcome To Java^=!";  
	s = s.replaceAll("[=+^!]", "");  
	   
	System.out.println(s);
	
}
}
