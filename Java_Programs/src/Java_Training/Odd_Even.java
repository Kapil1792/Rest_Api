package Java_Training;

public class Odd_Even {
public static void main(String[] args) {
	for(int i=0;i<=10;i++) {
		int a =i%2;
		if(a==0) {
			System.out.println("It is Even: "+i );
		} else 
			System.out.println("It is Odd: "+i);
	}
}
}
