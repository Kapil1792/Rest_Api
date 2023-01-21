package Java_Training;

public class Totalling_Digits {
public static void main(String[] args) {
	int a = 12345;
	int sum = 0;
	while (a>0) {
		int reminder = a%10;
		sum = reminder+sum;
		a=a/10;
	}
	System.out.println(sum);
}
}
