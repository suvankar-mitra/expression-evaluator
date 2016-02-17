package maths;

//this is a demo class
public class Driver {
	public static void main(String[] args) {
		String expr = "5! + sin(30) - ln(10) + 2 * pi / e";	//demo expression
		
		Double d = ExpressionEvaluator.evaluate(expr);		//evaluating expression
		
		System.out.println(d);
	}
}
