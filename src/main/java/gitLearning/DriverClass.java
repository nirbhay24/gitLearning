package gitLearning;

public class DriverClass {

	public static void main(String[] args) {
		Class1 c = new Class1();
		c.method1().ifPresent(System.out::print);

		Calculator cal = new Calculator();
		System.out.println(cal.addition(4, 7));
		
	}

}
