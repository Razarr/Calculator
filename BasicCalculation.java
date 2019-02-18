public class BasicCalculation {

	double  first;
	double  second;

	public BasicCalculation(double first, double second) {

		this.first = first;
		this.second = second;

	}
	
	public double composition(double first, double second) {
		return first + second;
	}
	
	public double substraction(double first, double second) {
		return first - second;
	}

	public double multiplication(double first, double second) {
		return first * second;
	}
	
	public double division(double first, double second) {
		return first / second;
	}
}
