
import java.util.HashSet;

public class UniqueObject {

	public static void main(String args[]) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Grapes");
		hset.add("Orange");
		hset.add("Fig");
		hset.add("DragonFruit");
		hset.add("JackFruit");
		hset.add("Banana");
		hset.add("PineApple");
		hset.add("Guava");
		hset.add("Apple");
		hset.add("Mango");
		System.out.println(hset);
	}
}
