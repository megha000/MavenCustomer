
public class DataTypesDemo {

	public static void main(String[] args) {
	/*	int i = 123;
		long l = 9876543210L;
		double d = 0.235657;
		float f = 3.14F;
		boolean b = true;
		char c = '\u0067';
		System.out.println("int: " + i);
		System.out.println("Long: " + l);
		System.out.println("Double: " + d);
		System.out.println("Float: "  + f);
		System.out.println("Char: " + c);
		System.out.println("Boolean: " + !b);		*/
		
		int a = 23;
		char c = 'q';
		System.out.print("int " + a );
		System.out.print("char "+ c);
		
		int[] arrayname = {1,2,3,4,5};
		
		for (int p = 0; p < arrayname.length; p++) {
			System.out.print(  arrayname[p] + "\t");
		}
	}

}
