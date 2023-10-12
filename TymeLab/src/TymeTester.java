// Halle Bristol 2016
// Syracuse University Project Advance (SUPA)
// Computer Engineering

public class TymeTester {
	public static void main(String[] args) {
		
		Tyme a = new Tyme(11, 14, false);
		Tyme b = new Tyme (8, 24, false);
		Tyme c = new Tyme (6, 02, false);
		Tyme d = new Tyme (8, 42, true);
		
		System.out.println(a.toString());
		
		System.out.println(a.minutesSinceMidnight()
				+ " minutes since midnight");
		
		System.out.println(a.advanceTyme(2, 58));
		
		System.out.println(b.convertToMilitaryTime());
		
		System.out.println(c.minutesBetweenTyme(d)); } }