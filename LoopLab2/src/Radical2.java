// Halle Bristol 2016
// Syracuse University Project Advance (SUPA)
// Computer Engineering

public class Radical2 {
public static void main(String[] args) {
	int n = 12,  a = 1;

	for(int f = n; f > 1; f--) {
		if(n % f == 0) {
			
			for(int fac = 2; fac < f; fac++) {
				//System.out.println("f is " + f + ", fac is " + fac + ", a is " + a);
				
				if(fac * fac == f){
					a *= fac;
					n /= f; } } } }
	System.out.println(a + " rad " + n); } }