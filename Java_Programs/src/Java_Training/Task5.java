package Java_Training;

public class Task5 {
public static void main(String[] args) {
//	String s ="HOMEPAGE";
	String s = "HoMePaGe";
	char[] charArray = s.toCharArray();
	for (int i = 0; i < charArray.length; i++) {

	if (Character.isLowerCase(charArray[i])) {

	System.out.print(Character.toUpperCase(charArray[i]));

	}
	}
	

}
}
