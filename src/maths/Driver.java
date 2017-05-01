package maths;

import java.util.Scanner;

//this is a demo class
public class Driver {
	public static void main(String[] args) {
	//	String expr = "tan( 0- 2)";	//demo expression
		
		//Take input from console(user)
		Scanner sc = new Scanner(System.in);
	    String expr =sc.next();
		
		Double d = ExpressionEvaluator.evaluate(expr);		//evaluating expression
		
		System.out.println(d);
	}
}
