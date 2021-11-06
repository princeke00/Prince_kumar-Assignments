import java.util.Scanner;
import java.lang.Math;

public class IsArmstrong {
	public static void main(String[] a) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check Armstrong num:");
		int n = s.nextInt();
		s.close();
		boolean b = isArmStrong(n);
		if (b == true)
			System.out.println(" is Armstrong number");
		else
			System.out.println(" is not Armstrong number");
	}

	static boolean isArmStrong(int b) {
		int t = b, dc = countDig(b);
		double sum = 0;
		do {
			int r = b % 10;
			sum = sum + Math.pow(r, dc);
			b = b / 10;
		} while (b != 0);
		if (t == sum)
			return true;
		else
			return false;
	}

	static int countDig(int c) {
		int count = 0;
		do {
			count++;
			c = c / 10;
		} while (c != 0);
		return count;
	}
}
