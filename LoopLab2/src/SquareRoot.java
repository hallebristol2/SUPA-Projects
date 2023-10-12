// Halle Bristol 2016
// Syracuse University Project Advance (SUPA)
// Computer Engineering

public class SquareRoot {
	public static void main(String[] args) {
		double num, guess = 0, newGuess;
		
		for(int i = 1; i < 20; i++) {
			num = 30;
			guess = 2 + (int)(Math.random() * 20);
			newGuess = num / guess;
			guess = (newGuess + guess) / 2;
			System.out.println("newGuess: " + newGuess);
			System.out.println("guess: " + guess); } } }