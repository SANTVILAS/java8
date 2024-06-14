package generics;

public class PairUse {

	public static void main(String[] args) {
		Pair p = new Pair(1, 2);
		p.setFirst(10);
		System.out.println(p.getFirst());
	    System.out.println(p.getSecond());
		
		
	}
}
