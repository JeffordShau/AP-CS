/*
AJR (Jefford Shau, Ameer Alnasser, Ryan Lau)
APCS
HW26 -- GCD
2020-10-27
time spent: 
*/

/*
DISCO: 

QCC: 

ALGO: 

*/

public class Stats{

  public static int gcd(int a, int b){
	  int counter = 0;
		int GCD;
    if (a > b) {
      int smaller = a; 
    } else {
      int smaller = b;
    }
		while (counter < smaller) {
			counter += 1;
			if (a % counter == 0) and (b % counter == 0) {
				GCD = counter;
			}
		}
		return GCD;
  }
  
	 public static int gcd(int a, int b){
		if (a == b){
			return a;
		} else {
		if (a < b) {
			gcd(a , b - a);
		} else{
		  gcd(a - b, b);
    }
    }
   }
  
	public static int gcd(int a, int b){
		while (a!=b){
			if (a>b){
				a=a-b;
			}
			else{
				b=b-a;
			}
		        gcd(a,b);
			}
		return a;
		}
}
