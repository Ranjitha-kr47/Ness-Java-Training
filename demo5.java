package demo1;

public class demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(i + "-" + j);
			}
		}
		int i, j;

		for (i = 0; i <= 5; i++) {
			for (j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (i = 0; i < 5; i++) {
			for (j = 2 * (5 - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

		System.out.println();

		for (i = 5; i > 0; i--) {
			for (j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();

		for (i = 0; i <= 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= 5 - 1 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
