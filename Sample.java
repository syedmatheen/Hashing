import java.util.Hashtable;

public class Sample {
	public static void main(String args[]) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(5, "output");
		ht.put(15,"of");
		ht.put(1,"hashtable");
		ht.put(39,"checking");
		
		System.out.println(ht);
	}

}
