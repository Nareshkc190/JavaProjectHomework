
public class StringPractice {
	
	
	public static void main(String[] args) {
		String h = "hello";
		String h2 = "hello";
		System.out.println(h);
		System.out.println(h2);
		h2 = "string";
		System.out.println(h);
		System.out.println(h2);
		
		StringBuilder s = new StringBuilder("change this");
		s.replace(2,3, "d");
		System.out.println(s);
		
	}
}