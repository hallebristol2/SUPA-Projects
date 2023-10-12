// Halle Bristol 2016
// Syracuse University Project Advance (SUPA)
// Computer Engineering

public class PirateTester {
	public static void main(String[] args) {
		Pirate one = new Pirate();
		Pirate two = new Pirate("Greybeard", 2000, true, false);
		Pirate three = new Pirate("Blackbeard", 3700, false, false);
		
		one.greet();
		two.hail();
		two.loseAnEye();
		System.out.println("Greybeard lost an eye, and "
				+ "now has an eyepatch. This is " + (two.isHasEyepatch()) + ".");
		
		one.gimmeLoot();
		System.out.println("Whitebeard used to have "
				+ "1500 gold. He now has " + (one.getNumOfgold()) + " gold.");
		
		three.goBroke();
		System.out.println("Blackbeard used to have 3000 gold. His ship "
				+ "wrecked and now he has " 	+ (three.getNumOfgold()) + " gold.");
		
		one.robPirate(two, 50);
		System.out.println("Greybeard has " + (two.getNumOfgold() + " gold."));
		System.out.println("Whitebeard's gold: " 
		+ one.getNumOfgold() + " Greybeard's gold: " + (two.getNumOfgold()));
		
		one.complain();
		two.complain();
		three.complain(); } }