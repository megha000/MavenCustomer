
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello";		//	using primitive style, assigned by autoboxing
		String s2 = new String("Hello");	//	using object instantiation
		String s3 = "Hello";
		
		// Reference comparison
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		// Value comparison
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1 = s1 + "World";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3, 7));
		
		System.out.println(s1.concat("ofJava"));
		System.out.println(s1.replace('o', 'a'));
		
		System.out.println(s1);
	}
}
