public class Residual {
	
	private double firstNo;
	private double secondNo;

	public Residual(double firstNo, double secondNo) {
	
		this.firstNo = firstNo;
		this.secondNo = secondNo;


	}
	
	public double residualCount(double firstNo, double secondNo) {

		return firstNo * secondNo;
	}


}
