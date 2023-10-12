// Halle Bristol 2016
// Syracuse University Project Advance (SUPA)
// Computer Engineering

public class Pirate {
		private String name;
		private int numOfgold;
		private boolean hasHooks, hasEyepatch;
		
		public Pirate(String name, int numOfgold, boolean hasHooks,
				boolean hasEyepatch) {
			super();
			this.name = name;
			this.numOfgold = numOfgold;
			this.hasHooks = hasHooks;
			this.hasEyepatch = hasEyepatch; }
		
		public Pirate() {
			super();
			name = "Whitebeard";
			numOfgold = 1500;
			hasHooks = true;
			hasEyepatch = false; }

		public String getName() {
			return name; }

		public void setName(String name) {
			this.name = name; }

		public int getNumOfgold() {
			return numOfgold; }

		public void setNumOfgold(int numOfgold) {
			this.numOfgold = numOfgold; }

		public boolean isHasHooks() {
			return hasHooks; }

		public void setHasHooks(boolean hasHooks) {
			this.hasHooks = hasHooks; }

		public boolean isHasEyepatch() {
			return hasEyepatch; }

		public void setHasEyepatch(boolean hasEyepatch) {
			this.hasEyepatch = hasEyepatch; }
		
		public void greet() {
			System.out.println("Ahoy!"); }
		
		public void hail() {
			System.out.println("Yo ho ho!"); }
		
		public void loseAnEye() {
			hasEyepatch = true; }
		
		public void gimmeLoot() {
			numOfgold += 10; }
		
		public void goBroke() {
			numOfgold = 0; }
		
		public void addLoot(int amount) {
			numOfgold += amount; }
		
		public void lessLoot(int amount) {
			numOfgold -= amount; }
		
		public void robPirate(Pirate other, int amount) {
			other.lessLoot(amount);
			this.addLoot(amount); }
		
		public void complain() {
			if (hasEyepatch) {
				System.out.println("My eye!"); }
			
			else if (hasHooks &&! hasEyepatch) {
				System.out.println("My hand!"); }
			
			else if (hasHooks == false && hasEyepatch == false 
					&& this.numOfgold == 0) {
				System.out.println("My gold!"); }
			
			else if (hasHooks && hasEyepatch && this.numOfgold == 0) {
				System.out.println("My life!"); } } }