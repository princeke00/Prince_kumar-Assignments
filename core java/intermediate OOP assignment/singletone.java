//this is the singleton class which is final.
//Therefore it cannot be inherited.
public final class singletone {
	private singletone() {
	}

	public static final singletone s = new singletone();

	public static singletone match() {
		return s;
	}

}
