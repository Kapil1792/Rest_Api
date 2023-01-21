package Java_Training;

public class PrimeNumber {
public static void main(String[] args) {
	int a = 36;
	int count = 0;
	for (int i=2;i<a;i++) {
		int r = a%i;
		if(r==0) {
			count++;
		}
	}
	if(count==0) {
		System.out.println("It is a Prime Number: "+a);
	}else {
		System.out.println("It is not a Prime Number: "+a);
	}
	}
}

