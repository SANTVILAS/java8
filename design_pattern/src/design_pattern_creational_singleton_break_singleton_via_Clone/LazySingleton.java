package design_pattern_creational_singleton_break_singleton_via_Clone;

public class LazySingleton extends MyClone{

	private LazySingleton() {

	}

	private static LazySingleton instance;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		throw new CloneNotSupportedException();
	
	}

	public static LazySingleton getInstance() {

		if (instance == null) {
			return instance = new LazySingleton();

		} else {
			return instance;
		}

	}

}
