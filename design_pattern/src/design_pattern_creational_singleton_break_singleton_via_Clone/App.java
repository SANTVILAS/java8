package design_pattern_creational_singleton_break_singleton_via_Clone;

import java.lang.reflect.Constructor;
import java.util.Iterator;

public class App {

	
	public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, SecurityException {
		
		LazySingleton instance1=LazySingleton.getInstance();
		System.out.println(instance1.hashCode());
//=====================================================================================		
//		LazySingleton instance2=(LazySingleton) instance1.clone();
//	
	//	System.out.println(instance2.hashCode());
		
//======================================================================================
		LazySingleton refelctionInstace = null;
		
		Constructor[] constructors = LazySingleton.class.getDeclaredConstructor();
		for(Constructor constructor : constructors) {
			constructor.setAccessible(true);
			refelctionInstace = (LazySingleton) constructor.newInstance();
			
		}
		
		
	}
}
