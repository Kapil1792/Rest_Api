package Java_Training;

public class Prime0to100 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			int count = 0;
			for(int j=2;j<=i/2;j++) {
				int r =i%j;
				if(r==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("It is a Prime Number: "+i);
			}
		}
	}

}
