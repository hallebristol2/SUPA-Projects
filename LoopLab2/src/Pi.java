// Halle Bristol 2016
// Syracuse University Project Advance (SUPA)
// Computer Engineering

public class Pi {
	public static void main(String[] args) {
		double pi = 0;

		for(int i = 1; i < 1000; i += 4) {
			pi += 4.0 / i + ((4.0 / (i + 2)) * -1);
			System.out.println(pi); }	} }