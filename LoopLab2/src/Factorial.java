// Halle Bristol 2016
// Syracuse University Project Advance (SUPA)
// Computer Engineering

public class Factorial {
	public static void main(String[] args) {
		int input = 3, f = 1;
		
		for(int h = 1; h <= input; h++) {f *= h;}
		
		System.out.println("The factorial of " + input + " is " + f);	} }