public class Calculator {
	public double add(double a, double b) {
		return a + b;
	}
	public double sub(double a, double b) {
		return a - b;
	}
	public double mult(double a, double b) {
		return a * b;
	}
	public double div(double a, double b) {
	if (b != 0)
		return a / b;
	else {
		return 0;
	}
	}

}
