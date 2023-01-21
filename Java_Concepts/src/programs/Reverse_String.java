package programs;

public class Reverse_String {
	public static void main(String[] args) {
		String s = "Signature of the person";
		
		char[] charArray = s.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);
			
		}
		System.out.println("Character count:"+" "+charArray.length);
	}

}
