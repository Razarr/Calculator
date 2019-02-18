public class PercentageCalculation {

	private double number;
	private double percentage;

	public PercentageCalculation( double number, double percentage) {
	
		this.number = number;
		this.percentage = percentage;
	}
	
	public double percentCalculate(double number, double percent) {

		return (number * 100) / percent; 
	}

}
