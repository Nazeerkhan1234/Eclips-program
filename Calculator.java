
public class Calculator {
	int a = 10;
	int b = 10;

	public void addtion() {
		System.out.println(a + b);
	}

	public void subtraction() {
		System.out.println(a - b);
	}

	public void multiplication() {
		System.out.println(a * b);
	}

	public void division() {
		System.out.println(a / b);
	}

	public void average() {
		System.out.println((a + b) / 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.addtion();
		cal.subtraction();
		cal.multiplication();
		cal.division();
		cal.average();

	}

}
