
public class ArrayDemo {

	public static void main(String[] args) {
		int[] ar = {10, 20, 30, 40, 50};
		for (int i = 2; i < ar.length; i++) {
			System.out.println(ar[i] + " ");
		}
		for (int e : ar) {
			System.out.printf("%d\n", e);
		}
		
		int[][] jaggu = {{1,2}, {3,4,5}, {6,7,8,9}};
		for (int j = 0; j < jaggu.length; j++) {
			for (int k = 0; k < jaggu[j].length; k++) {
				System.out.print(jaggu[j][k] +"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[] src = {3, 1, 5, 2, 4};
		
		for (int i = 0; i < src.length; i++) {
			System.out.print(src[i] + "\t");
		}
		
		System.out.println();
		
		for (int i = 0; i < (src.length - 1); i++) {
			for (int j = 0; j < (src.length - i - 1); j++) {
				if (src[j] > src[j+1]) {
					int temp = src[j];
					src[j] = src[j+1];
					src[j+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < src.length; i++) {
			System.out.print(src[i] + "\t");
		}
	
		System.out.println();
		
		int count = 0;
		for(int i=2; i <= 100; i++) {
			for(int j = 2; j <=i; j++) {
					if(i == 2) {
						System.out.print(i +"\t");
					}
					else if(i % j != 0) {
					count++;
					if (count == i-2) {
						System.out.print(i + "\t");
					}
				}
			}
			count = 0;
		}
		
	}
}



