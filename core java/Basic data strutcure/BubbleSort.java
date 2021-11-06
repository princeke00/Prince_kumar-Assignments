import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("enter the element to find : ");
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		s.close();
		boolean b= findEle(a);
		if (b==true)
			System.out.println("element found");
		else
			System.out.println("element not found");
	}
	static boolean findEle(int a) {
		int x[]	={ 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 58, 64, 7 };
		int c=1;
		while(c<x.length) {
			for(int i=0;i<x.length-c;i++) {
				if(x[i]>x[i+1]) {
					int temp=x[i];
					x[i]=x[i+1];
					x[i+1]=temp;
				}
			}
			c++;	
		}
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println("");
		for(int i=0;i<x.length;i++) {
			if(x[i]==a) {
				return true;
			}
			
		}
		return false;
	}
	
}


