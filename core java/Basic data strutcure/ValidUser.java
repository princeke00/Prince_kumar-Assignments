import java.util.Scanner;

public class ValidUser {

	public static void main(String[] args) {
		int attempt = 2;
		loginDetails(attempt);
	}

	static void loginDetails(int a) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter userid : ");
		String userid = s.next();
		System.out.println("enter password : ");
		String password = s.next();
		login(userid, password, a);
		s.close();
	}

	static void login(String a, String b, int c) {
		String uid = "princeke00", ps = "prince";
		if (c != 0) {
			if (uid.equals(a) && ps.equals(b)) {
				System.out.println("welcome " + uid);
			} else {
				System.out.println("invalid details");
				c--;
				loginDetails(c);
				if (c == 0) {
					System.out.println("contact admin");
				}
			}
		}
	}

}
