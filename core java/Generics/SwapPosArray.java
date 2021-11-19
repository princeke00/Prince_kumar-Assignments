
public class SwapPosArray {
	public static void main(String[] args) {
		String[] a = { "Prince", "Kumar" };
		System.out.println("before swap: " + a[0] + " " + a[1]);
		swap(a);
		System.out.println("after swap : " + a[0] + " " + a[1]);

	}

	public static void swap(String[] a) {
		String temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
}
