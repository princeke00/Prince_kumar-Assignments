import java.util.HashMap;
import java.util.Set;

public class Generic2 {

	public static void main(String[] args) {
		HashMap<Integer, Double> hm = new HashMap<>();
		hm.put(1, 1.00);
		hm.put(2, 2.0);
		hm.put(3, 3.0);
		hm.put(4, 4.0);
		hm.put(5, 5.0);
		hm.put(6, 6.0);
		hm.put(7, 7.0);
		hm.put(8, 8.0);
		hm.put(9, 9.0);
		hm.put(10, 10.0);

		Set<Integer> keys = hm.keySet();
		for (int i : keys) {
			System.out.println("Key:" + i + ":: Values:" + hm.get(i));
		}
	}

}