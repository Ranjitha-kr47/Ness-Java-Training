package demo1;

public class demo3 {
	int a = 10;
	static int b = 20;
	int c = 30;

	static void something() {
		int c = 30;
		System.out.println(c);
	}

	public static void main(String[] args) {
		demo3 dm = new demo3();
		System.out.println(dm.a);
		System.out.println(b);
		demo3.something();
		// TODO Auto-generated method stub

	}

}
