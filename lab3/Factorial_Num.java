package lab3;

public class Factorial_Num {

	public static void main(String[] args) {

		int y = 1, y1 = 1, y2 = 1, x = (int) (Math.random() * 8);
		System.out.println(x);

		for (int i = 1; i <= x; i++)
			y1 = y1 * i;
		System.out.println(y1);

		System.out.println("**********");

		// ▪ Incremental loop
		for (int i = 1; i <= x; i++) {
			y = y * i;
			System.out.println(y);
		}
		System.out.println("**********");
		// ▪ Decremental Loop
		/*
		 * 
		 * for (int i=x;i>=1;i--) {
		 * 
		 * y2=y1/i; System.out.println(y2);
		 * 
		 * }
		 */

	}

}
