import java.util.Scanner;
import java.lang.Math;

public class CiSi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("amount is :");
		int pr = sc.nextInt();
		System.out.println("rate is :");
		int r = sc.nextInt();
		System.out.println("time is :");
		int t = sc.nextInt();
		sc.close();
		double d1 = simpleInt(pr, r, t);
		System.out.println("Simple intrest is :" + d1);
		double d2 = compoundInt(pr, r, t);
		System.out.println("Compound intrest is :" + d2);
	}

	static double simpleInt(int a, int b, int c) {
		double x = (a * b * c) / 100;
		return x;
	}

	static double compoundInt(int d, int e, int f) {
		double y = d * (Math.pow((1 + (e / 100)), f));
		;
		return y;
	}

}
