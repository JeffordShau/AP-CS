/*
JWJ (Jefford Shau, Willaim Vongphanith, Jacob Kirmayer)
APCS
HW49 -- Rational Standards Compliance
2021-12-22
*/

/*
DISCO:
  0.
QCC:
  0.
*/


public class Driver {

  public static void main(String[] args) {
      Integer rations = new Integer(5);
      Rational test1 = new Rational(-1, 5);
      Rational test2 = new Rational(-1, 2);
      Rational test3 = new Rational(-1, 10);

      System.out.println(test1.compareTo(test2) + " Should be 1");
      System.out.println(test2.compareTo(test3) + " Should be 1");
  }

}
