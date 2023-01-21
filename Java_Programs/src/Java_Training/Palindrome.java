package Java_Training;

public class Palindrome {
	public static void main(String[] args) {
		int a=12321;
		int b=a;
		int sum = 0;
		while(a>0) {
			int reminder = a%10;
			sum = (sum*10)+ reminder;
			a=a/10;
		}
		if (b==sum)  {
	System.out.println("It is a Palindrome");
		}
	else {
		System.out.println ("It is not a Palindrome");
	
	}
	}

}