import java.util.Scanner;

public class AithmeticExUOE {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number:");
		int a = sc.nextInt();
		System.out.println("Enter The Second Number:");
		int b = sc.nextInt();
		
		try {
			if (b != 0) {
				int c = (a / b);
				System.out.println("Division of Two Numbers: " + c);
			} else
				throw new UnsupportedOperationException();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
	}
}
