import java.util.Scanner;

public class SearchEle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the elemnt to be serached: ");
		int x = s.nextInt();
		boolean st = containsEle(x);
		s.close();
		if (st == true)
			System.out.println("the element " + x + " is present in the given aaray");
		else
			System.out.println("elemnt not found");
	}

	static boolean containsEle(int a) {
		int q[] = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 58, 64, 7 };
		for (int i = 0; i < q.length; i++) {
			if (q[i] == a) {
				return true;
			}

		}
		return false;

	}
}
