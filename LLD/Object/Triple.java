public class Triple {
	String name;
	int age;
	public static void main(String[] args) {
		Triple s1 = new Triple();
		Triple s2;// = new Triple();
		s1.name = "Richa";
		s1.age = 28;
		System.out.println(s1.name);
		// s2.name = "Himanshu";
		// s2.age = 27;
		// System.out.println(s2.name);
		s1=s2;
		System.out.println(s1.name);
	}
}