import java.util.Scanner;

public class TotalMarks {
	static int[] readMarks() {
		Scanner s = new Scanner(System.in);
		int x[] = new int[3];
		for (int i = 0; i < 3; i++) {
			x[i] = s.nextInt();
		}
		
		return x;
	}

	public static void main(String[] args) {
		System.out.println("enter the marks for subject A :");
		int[] a = new int[3];
		a = readMarks();

		System.out.println("enter the marks for subject B :");
		int[] b = new int[3];
		b = readMarks();

		System.out.println("enter the marks for subject C :");
		int[] c = new int[3];
		c = readMarks();
		
		System.out.println();
		int f= totalMarks(a);
		System.out.println("tatal marks for subject A is : "+f);
		int g=totalMarks(b);
		System.out.println("tatal marks for subject B is : "+g);
		int h=totalMarks(c);
		System.out.println("tatal marks for subject C is : "+h);
		
		int i= avgMarks(a);
		System.out.println("avg marks for subject A is : "+i);
		int j=avgMarks(b);
		System.out.println("avg marks for subject B is : "+j);
		int k=avgMarks(c);
		System.out.println("avg marks for subject C is : "+k);

	}

	static int totalMarks(int[] q) {
		int totalmarks = 0;
		for (int i = 0; i < q.length; i++) {
			totalmarks += q[i];
		}
		return totalmarks;
	}

	static int avgMarks(int[] w) {
		int avgMarks = 0;
		for (int i = 0; i < w.length; i++) {
			avgMarks += w[i];
		}
		avgMarks /= 3;
		return avgMarks;
	}

}
