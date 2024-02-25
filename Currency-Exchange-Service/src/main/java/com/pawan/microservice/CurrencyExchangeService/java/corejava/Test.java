package corejava;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		/*System.out.println("Test");
		
		demo d = new demo();
		d.sendDate(null);
		d.setCreatedOn(new Date("foo-bar 2014"));
		
		System.out.println("dfgfdgdfg"+d.getCreatedOn());*/


		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = "Abc";

		System.out.println("s1 == s2 ? " + (s1 == s2));// true

		System.out.println("s1 == s3 ? " + (s1 == s3)); // false

		System.out.println("s1 == s3 ? " + (s1 == s3.intern())); // true

		System.out.println("s1 equals s3 ? " + (s1.equals(s3))); // true

		System.out.println("s1 equals s4 ? " + (s1.equals(s4))); //false



	}

}
