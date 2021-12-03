/*
JWJ (Jefford Shau, William Vongphanith, Jacob Kirmayer)
APCS
HW41 -- Be Rational
2021-12-01
time spent: 0.5 hr
*/

/*
DISCO:
  0. The divide method and overloaded constructor needs specific conditionals when either the numerator or denominator is zero.
QCC:
  0. How can we implement a method that simplifies the fractional representation of the rational to simplest form.
*/

public class Rational {

    private int _p; // numerator
    private int _q; // denominator

    public Rational () {
        _p = 0;
        _q = 1;
    }

    public Rational (int p, int q) {
        if (q == 0) {
          System.out.println("Invalid denominator detected. Will proceed to set default values.");
          _p = 0;
          _q = 1;
        } else {
          _p = p;
          _q = q;
        }
    }

    public String toString() {
        return _p + "/" + _q;
    }

    public double floatValue() {
        return (double) _p / _q;
    }

    public void multiply (Rational rational) {
        _p = this._p * rational._p;
        _q = this._q * rational._q;
    }

    public void divide (Rational rational) {
      if (rational._p == 0) {
        System.out.println("Error: cannot divide by zero.");
      } else {
        _p = this._p * rational._q;
        _q = this._q * rational._p;
      }
    }

    public static void main(String[] args) {

      // Ryan Lau test cases on Piazza
      Rational r0 = new Rational(10, 0);
      System.out.println(r0);
      System.out.println("=============");

      Rational r1 = new Rational(10, 5);
      Rational r2 = new Rational(3, 6);

      System.out.println(r1);
      System.out.println(r2);
      System.out.println(r1.floatValue());
      r1.multiply(r2);
      System.out.println(r1);
      r1.divide(r2);
      System.out.println(r1);

      System.out.println("=============");
      Rational r3 = new Rational(2, 3);
      Rational r4 = new Rational();

      System.out.println(r3);
      System.out.println(r4);
      System.out.println(r3.floatValue());
      r3.multiply(r4);
      System.out.println(r3);
      r3.divide(r4);
      System.out.println(r3);

      // Lauren Lee test cases on Piazza
      Rational def = new Rational();
      System.out.println("Default contructor: " + def + " ...should be 0/1");
      System.out.println("//====================================");

      Rational d0 = new Rational(1, 0);
      System.out.println("Denominator set to 0: " + d0 + " ...should be 0/1");
      System.out.println("//====================================");

      Rational r = new Rational(1,8);
      Rational s = new Rational(1,2);
      System.out.println("r: " + r + " ...should be 1/8");
      System.out.println("s: " + s + " ...should be 1/2");
      System.out.println("float value of r " + r.floatValue() + " ...should be 0.125");
      System.out.println("float value of s " + s.floatValue() + " ...should be 0.5");
      r.multiply(s);
      System.out.println("value of r after multiplication: " + r + " ...1/16");
      System.out.println("value of s after multiplication: " + s + " ...1/2");
      r.divide(s);
      System.out.println("value of r after division: " + r + " ...2/16");
      System.out.println("value of s after division: " + s + " ...1/2");


      // JWJ test cases from CW
      Rational rat = new Rational(3, 5);
      Rational rate = new Rational(7, 4);
      Rational ratio = new Rational(10, 13);

      System.out.println(rat.floatValue());
      System.out.println(rat.toString());
      rat.multiply(rate);
      System.out.println(rat.toString());
      rat.divide(ratio);
      System.out.println(rat.toString());


      // Gabriel Thompson test cases on Piazza
      System.out.println("\ntoString() and constructor test cases:");
      Rational a = new Rational();
      System.out.println(a + " ...should be \"0 / 1\"");
      Rational b = new Rational(5, 2);
      System.out.println(b + " ...should be \"5 / 2\"");
      Rational c = new Rational(1, 0);
      System.out.println(c + " ...should yield error");

      System.out.println("\nfloatValue() test cases:");
      Rational d = new Rational(6, 3);
      System.out.println(d.floatValue() + " ...should be \"2.0\"");
      Rational e = new Rational(5, 3);
      System.out.println(e.floatValue() + " ...should be \"1.66666667\"");
      Rational f = new Rational(-18, 9);
      System.out.println(f.floatValue() + " ...should be \"-2.0\"");

      System.out.println("\nmultiply() test cases:");
      Rational g = new Rational(5, 4);
      Rational h = new Rational(6, 10);
      g.multiply(h);
      System.out.println(g + " ...should be \"30 / 40\"");
      Rational i = new Rational(5, 10);
      Rational j = new Rational();
      i.multiply(j);
      System.out.println(i + " ...should be \"0 / 10\"");

      System.out.println("\ndivide() test cases:");
      Rational k = new Rational(10, 3);
      Rational l = new Rational(6, 4);
      k.divide(l);
      System.out.println(k + " ...should be \"40 / 18\"");
      // This next test cases checks for how the class reacts to divison by 0 in the divide() function
      Rational m = new Rational(5, 5);
      Rational n = new Rational();
      m.divide(n);
      System.out.println(m + " ...should yield an error\n");

    }

}
