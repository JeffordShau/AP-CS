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

/*
precond: a and b are positive integers
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
			if (a % counter == 0) && (b % counter == 0) {
				GCD = counter;
			}
		}
		return GCD;
  }
  
	 public static int gcdER(int a, int b) {
		if (a == b) {
			return a;
		} else {
		if (a < b) {
		  gcd(a , b - a);
		} else {
		  gcd(a - b, b);
    }
    }
   }
  
	public static int gcdEW(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(15, 38));
		System.out.println(gcd(9, 9));
		System.out.println(gcd(1, 2));
		System.out.println(gcd(1, 1));
		System.out.println(gcdER(15, 38));
		System.out.println(gcdER(9, 9));
		System.out.println(gcdER(1, 2));
		System.out.println(gcdER(1, 1));
		System.out.println(gcdEW(15, 38));
		System.out.println(gcdEW(9, 9));
		System.out.println(gcdEW(1, 2));
		System.out.println(gcdEW(1, 1));
	
	}
}
