package com.sateesh;
/**
 * functional interface
 */
interface sample{
	public void run();
}
/**
 * @author SateeshM
 *
 */

class SampleImplement{
	void display(sample s){
		s.run();
	}
}
public class LambdaExpressions {
	public static void main(String[] args) {
		SampleImplement s=new SampleImplement();
		s.display(()->System.out.println("This is simple style of Lambda Expressions"));
	}
}
