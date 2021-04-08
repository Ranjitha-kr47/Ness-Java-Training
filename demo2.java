package demo1;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		int a = 10;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);

		int x = 100;
		int y = 200;
		System.out.println(x++ + y++);
		System.out.println(++x + ++y);

		int b = 10;
		int c = 20;
		int d = 30;
		System.out.println(b < c && b < d);
		System.out.println(c < d || c < a);

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a % b);

		if (a > c)
			System.out.println(a);
		else
			System.out.println(c);

		int result = (a > c) ? a : c;
		System.out.println(result);

	}

}
