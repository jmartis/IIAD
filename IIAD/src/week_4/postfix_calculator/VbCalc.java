package week_4.postfix_calculator;

public class VbCalc {
	
	public static void main(String args[]) {
		String invoer = "3 4 5 + *";// (4 + 5) X 3 = 27
		PostFixCalculator pf = new PostFixCalculator(invoer);
		System.out.println("uitvoer is : " + pf.getResultaat());
	}
}
