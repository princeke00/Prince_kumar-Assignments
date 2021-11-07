import java.util.Scanner;

public class AirthemticEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int n1 = sc.nextInt();
		System.out.println("Enter Second number");
		int n2 = sc.nextInt();
		try {
			int res = n1 / n2;
			System.out.println("Result::=" + res);

		} catch (ArithmeticException e) {
			e.printStackTrace();

		} finally {
			sc.close();
		}

	}

}
