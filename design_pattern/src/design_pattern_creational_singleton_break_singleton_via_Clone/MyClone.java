package design_pattern_creational_singleton_break_singleton_via_Clone;

public class MyClone implements Cloneable{
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	

}
