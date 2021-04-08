package demo1;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 4;
		switch (number) {
		case 1: {
			System.out.println("one");
			break;
		}
		case 2: {
			System.out.println("two");
			break;
		}
		case 3: {
			System.out.println("three");
			break;
		}
		default:
			System.out.println("invalid number");
		}

		String str = "one";
		switch (str) {
		case "one": {
			System.out.println(1);
			break;
		}
		case "two": {
			System.out.println(2);
			break;
		}
		case "three": {
			System.out.println(3);
			break;
		}
		default:
			System.out.println("invalid number");
		}

		int a = 10;
		int b = 20;

		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

		System.out.println((a % 2 == 0) ? "even" : "odd");

		int score = 96;
		if (score >= 40 && score < 50) {
			System.out.println("D grade");
		} else if (score >= 50 && score < 70) {
			System.out.println("C grade");

		} else if (score >= 70 && score < 90) {
			System.out.println("B grade");

		} else if (score >= 90 && score <= 100) {
			System.out.println("A grade");
		} else
			System.out.println("Fail");
	}

}
