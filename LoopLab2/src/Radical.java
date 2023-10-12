// Halle Bristol 2016
// Syracuse University Project Advance (SUPA)
// Computer Engineering

import java.util.ArrayList;

public class Radical {
	public static void main(String[] args) {
		int n = 500, factors = 0, factors2 = 0, factors3 = 0;
		ArrayList<Integer> factorNums = new ArrayList<Integer>();
		ArrayList<Integer> factorNums2 = new ArrayList<Integer>();
		ArrayList<Integer> factorNums3 = new ArrayList<Integer>();
	
		/*Find factors, make list
		 *Take first and last in list
		 *Factor them if needed ---> How to loop factoring the factors until no more?
		 *Place in designated spots */
	
		for(int d = 2; d < n; d++) {
			if(n % d == 0) { //DOUBLE FACTORS
				factorNums.add(d);
				factors++;
				if(d * d == n) {
					factorNums.add(d);
					factors++; } }
			
			if(d * d == n) {
				System.out.println("Radical " + n + " simplified is " + d);
				System.exit(1); } }
	
		if(factors == 0)
		System.out.println("Radical " + n + " cannot be further simplified.");
	
		if(factors >= 2) {
			System.out.println(factorNums);
			int ls = factorNums.size();
			System.out.println("List size is " + ls);
			
			int f1Loc = 0; //location in list
			int f2Loc = factorNums.size() - 1; //size = 4, count from 0
			
			int f1 = (Integer)factorNums.get(f1Loc);
			int f2 = (Integer)factorNums.get(f2Loc);
			System.out.println(f1);
			System.out.println(f2);
			
			for(int d2 = 2; d2 < f1; d2++) {
				if (f1 % d2 == 0) {
					factorNums2.add(d2);
					factors2++; } }
					
			if(factors2 >= 2) {
				System.out.println(factorNums2);
				int ls2 = factorNums.size();
				System.out.println("List size is " + ls2);
					
				int f3Loc = 0;
				int f4Loc = factorNums2.size() - 1;
					
				int f3 = (Integer)factorNums.get(f3Loc);
				int f4 = (Integer)factorNums.get(f4Loc);
				System.out.println(f3);
				System.out.println(f4); } 
				
				else {
					System.out.println("Factor one is " + f1);
					System.out.println(""); }
					
			for(int d3 = 2; d3 < f2; d3++) {
				if(f2 % d3 == 0) { //DOUBLE FACTORS
					factorNums3.add(d3);
					factors3++;
					
					if(d3 * d3 == f2) {
						factorNums3.add(d3);
						factors3++; } } }
				
				if(factors3 >= 2) {
					System.out.println(factorNums3);
					int ls3 = factorNums3.size();
					System.out.println("List size is " + ls3);
					
					int f5Loc = 0;
					int f6Loc = factorNums3.size() - 1;
					
					int f5 = (Integer)factorNums3.get(f5Loc);
					int f6 = (Integer)factorNums3.get(f6Loc);
					System.out.println(f5);
					System.out.println(f6); 			
		
				if(f5 == f6)
					System.out.println("Radical " + n + " simplified: " + f5 + " rad " + f1);
				
				else if(f1 == f5)
					System.out.println("Radical " + n + " simplified: " + f1 + " rad " + f6);
				
				else if(f1 == f6)
					System.out.println("Radical " + n + " simplified: " + f1 + " rad " + f5);
				
				else if(f5 != f6 && f1 != f5 && f1 != f6)
					System.out.println("Radical " + n + " is already simplified.");
				
				else
					System.out.println("Radical " + n + " simplified " + f1);	}
				
				else
					System.out.println("Radical " + n + " cannot be simplified any further."); } } }