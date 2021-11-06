
public abstract class Persistence {
	abstract void persist();

}

class FilePesistence extends Persistence {

	@Override
	void persist() {
		System.out.println("The data is saved in the file...");

	}

}

class DatabasePersistence extends Persistence {

	@Override
	void persist() {
		System.out.println("The data in not saved in database yet....");

	}

}

class Client {
	public static void main(String[] args) {
		Persistence fp = new FilePesistence();
		fp.persist();
		Persistence dp = new DatabasePersistence();
		dp.persist();
	}
}
