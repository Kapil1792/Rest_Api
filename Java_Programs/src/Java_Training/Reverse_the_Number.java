package Java_Training;

public class Reverse_the_Number {
public static void main(String[] args) {
	int a=12345;
	int sum = 0;
	while(a>0) {
		int reminder = a%10;
		sum = (sum*10)+ reminder;
		a=a/10;
	}
System.out.println("Reverse the number:"+sum);}
}
