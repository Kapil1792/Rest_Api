package Java_Training;

public class Task4 {
public static void main(String[] args) {

	
	String s="thermofisher scientific";
	String[] split = s.split(" ");
	
	for(int i=0;i<=split.length-1;i++) {
	if(i==0) {
			char[] charArray = split[i].toCharArray();
			for(int j=charArray.length-1;j>=0;j--) {
				System.out.print(charArray[j]);
			}
			
	}else {
		System.out.print(" "+split[i]);
	}
	}
	}
}



