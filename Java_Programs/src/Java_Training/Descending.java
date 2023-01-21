package Java_Training;

import java.util.Arrays;

public class Descending {
	public static void main(String[] args) {
		int a[]= {1,3,5,2,4,1};
		Arrays.sort(a);
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
	}

}
}