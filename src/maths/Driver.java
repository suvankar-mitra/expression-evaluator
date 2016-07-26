package maths;

//this is a demo class
public class Driver {
	public static void main(String[] args) {
		String expr = "tan( 0- 2)";	//demo expression
		
		Double d = ExpressionEvaluator.evaluate(expr);		//evaluating expression
		
		System.out.println(d);
	}
}
