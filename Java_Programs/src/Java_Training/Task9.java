package Java_Training;

public class Task9 {
	public static void main(String[] args) {
		String s = "Happy New Year";

		String s1 = "Happy Pongal";

		System.out.println("Strings before swapping: " + s + " " + s1);

		s = s + s1;

		s1 = s.substring(0, (s.length() - s1.length()));

		s = s.substring(s1.length());

		System.out.println("Strings after swapping: " + s + " " + s1);
	}

}
