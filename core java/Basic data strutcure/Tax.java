import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your income : ");
		int m1 = sc.nextInt();
		sc.close();
		int s1 = tax(m1);
		System.out.println("Amount of tax to paid : "+s1);
	}

	static int tax(int a) {
		if (a >=0 && a <= 180000) {
			return 0;
		} else if (a > 180000 && a <= 300000) {
			return (a * 10) / 100;
		} else if (a > 300000 && a <= 500000) {
			return (a * 20) / 100;
		} else
			return (a * 30) / 100;
	}

}
