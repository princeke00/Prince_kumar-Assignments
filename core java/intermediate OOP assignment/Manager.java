import java.util.Scanner;

public class Manager extends Employee{
	public static void main(String[] args) {
		Manager m=new Manager();
		int a[]=m.readSal();
		m.totalsalry(a);
		
	}
	int[] readSal() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter sal of Manager : ");
		int sal=s.nextInt();
		System.out.println("enter incentive sal of Manager : ");
		int incentive=s.nextInt();
		int[] a= {sal,incentive};
		s.close();
		return a;
		}
	@Override
	void totalsalry(int x[]) {
		int Mtsal=0;
		for(int i=0;i<x.length;i++) {
			Mtsal+=x[i];	
		}
		System.out.println("total salry of manager is : "+Mtsal);
		
		return;
	}
}