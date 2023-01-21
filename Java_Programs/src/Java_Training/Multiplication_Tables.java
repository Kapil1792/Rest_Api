package Java_Training;

public class Multiplication_Tables {
	public static void main(String[] args) {
		int table = 8;
		int sum=1;
		for(int i=1;i<=10;i++) {
			sum=i*table;
			System.out.println(i+"*"+table+"="+sum)	;
		}
}

}