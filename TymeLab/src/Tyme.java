// Halle Bristol 2016
// Syracuse University Project Advance (SUPA)
// Computer Engineering

public class Tyme {
	private int hours, minutes;
	private boolean isAM;
	
	public Tyme(int hours, int minutes, boolean isAM) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.isAM = isAM; }
	
	public Tyme() {
		super();
		this.hours = 12;
		this.minutes = 00;
		this.isAM = true; }
	
	public int getHours() {
		return hours; }
	
	public void setHours(int hours) {
		this.hours = hours; }
	
	public int getMinutes() {
		return minutes; }
	
	public void setMinutes(int minutes) {
		this.minutes = minutes; 	}
	
	public boolean getIsAM() {
		return isAM; }
	
	public void getIsAM(boolean isAM) {
		this.isAM = isAM; }
	
	public String toString() {
		if (minutes == 0 && isAM == true)
			return (hours + ":" + minutes + "0" + "AM");
		
		else if (minutes == 0 && isAM == false)
			return (hours + ":" + minutes + "0" + "PM");
		
		else if (minutes < 10 && isAM == true)
			return (hours + ":" + "0" + minutes + "AM");
		
		else if (minutes < 10 && isAM == false)
			return (hours + ":" + "0" + minutes + "PM");
		
		else if (minutes >= 10 && isAM == true)
			return (hours + ":" + minutes + "AM");
		
		else
			return (hours + ":" + minutes + "PM"); }
	
	public int minutesSinceMidnight() {
		int s = 0;
		if (isAM == false) {
			s = (hours* 60) + (minutes);
			return s;	}
		
		else if (isAM == true && ((hours * 60) + (minutes)) > 720) {
			s = ((hours * 60) + (minutes)) - 720;
			return s; }
		
		else {
			s = 720 - ((hours*60) + (minutes)); }
		
		return s;	}
	
	public String advanceTyme(int h, int m) {
		String s = "";
		int a = (hours + h); 
		int b = (minutes + m); 
		if (b >= 60) {
			a = a + ((60 % b) / 60);
			b = b - 60; }
		
		if (a >= 12 && isAM == true) {
			a = a - 12; 
			isAM = false; }
		
		else if (a > 12 && isAM == false) {
			a = a - 12;
			isAM = true; }
		
		if (b == 0 && isAM == true) {
			s = (a + ":" + b + "0" + "AM");
			return s; }
		
		else if (b == 0 && isAM == false) {
			s = (a + ":" + b + "0" + "PM");
			return s; 	}
		
		else if (b < 10 && isAM == true) {
			s = (a + ":" + "0" + b + "AM");
			return s; 	}
		
		else if (b < 10 && isAM == false) {
			s = (a + ":" + "0" + b + "PM");
			return s; 	}
		
		else if (b >= 10 && isAM == true){
			s = (a + ":" + b + "AM");
			return s;
		}
		
		else
			s = (a + ":" + b + "PM");
		
		return s;
	}
		
		public String convertToMilitaryTime(){
			String h = "";
			if (minutes == 0 && isAM == false){
				hours += 12;
				return (hours + ":" + minutes + "0");
				}
			
			else if (minutes < 10 && isAM == false){
				hours += 12;
				return (hours + ":" + "0" + minutes);
				}
			
			else if (minutes >= 10 && isAM == false){
				hours += 12;
				return (hours + ":" + minutes);
				}
			
			
			if (minutes == 0 && isAM == true){
				return (hours + ":" + minutes + "0");
				}
			
			else if (minutes < 10 && isAM == true){
				return (hours + ":" + "0" + minutes);
				}
			
			else if (minutes >= 10 && isAM == true) {
				return (hours + ":" + minutes); }
			
			return h; }
		
		public String minutesBetweenTyme(Tyme t) {
			int h = 0, m = 0;
			if (isAM == true && t.isAM == true && hours > t.hours) 
				h = (hours - t.hours) * 60;
			
			if (isAM == true && t.isAM == true && hours < t.hours) 
				h = (t.hours - hours) * 60;
			
			if (hours > t.hours && isAM == false && t.isAM == false) 
				h = (hours - t.hours) * 60;
			
			else if (hours < t.hours && isAM == false && t.isAM == false) 
				h = (t.hours - hours) * 60;
			
			else if (hours > t.hours && isAM == true && t.isAM == false) 
				h = ((12 - hours) + t.hours) * 60;
			
			else if (hours < t.hours && isAM == true && t.isAM == false) 
				h = ((12 - t.hours) + hours) * 60;
			
			else if (hours < t.hours && isAM == false && t.isAM == true) 
				h = ((12 - hours) + t.hours) * 60;
			
			else if (hours < t.hours && isAM == false && t.isAM == true) 
				h = ((12 - t.hours) + hours) * 60;
			
			else if (hours == t.hours && isAM == true && t.isAM == true 
					|| isAM == false && t.isAM == false)
				h = 0;
				
			if (minutes > t.minutes)
				m = minutes - t.minutes;
		
			if (t.minutes > minutes)
				m = t.minutes - minutes;
			
			int w = h + m;

			return (w + " minutes between " + this.toString() + " and " + t.toString()); } }