
public class CmdLineDemo {

	public static void main(String[] args) {
		int sum = 0;		//	primitive style
		for (String arg : args) {
			sum += Integer.parseInt(arg);
		}
		System.out.println("SUM: " + sum);
	}

}
