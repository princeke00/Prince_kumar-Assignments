public class CountArmstrong {

	public static void main(String[] args) {
		System.out.println("Enter the range:");
		int st = 100;
		int ed = 1000;
		System.out.println("thr ranges are" + st + " & " + ed);
		armStrong(st, ed);
	}

	public static void armStrong(int s, int e) {
		int c = 0;
		for (int i = s; i <= e; i++) {
			int number = i, sum = 0, count = count(number);
			while (number != 0) {
				int rem = number % 10;
				sum = (int) (sum + Math.pow(rem, count));
				number = number / 10;
			}
			if (sum == i) {
				c++;
			}
		}
		System.out.println("the total nnumber of armstrong in the given range is: " + c);
		;
	}

	public static int count(int n) {
		int c = 0;
		while (n != 0) {
			n = n / 10;
			c++;
		}
		return c;
	}
}
