/*
JWJ (Jefford Shau, William Vongphanith, Jacob Kirmayer)
APCS
HW42 -- Be More Rational
2021-12-04
time spent: 0.5 hr
*/

/*
DISCO:
  0. Added two gcd methods, one static with two parameters and one non-static with no parameters. The non-static gcd method is used to call the static gcd methods with the private instance variables.
QCC:
  0. Is the keyword "this" necessary in a function when only one instance of a class is called at a time?
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

    public double floatValue() { // double is most precise with 64 bits
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

    public int gcd () {
      return gcd (this._p, this._q);
    }

    public static int gcd (int a, int b) {
      if (a == b) {
        return a;
      } else if (a > b) {
        return gcd(a - b, b);
      } else {
        return gcd(b - a, a);
      }
    }

    public void reduce(){
      int gcf = gcd(_p, _q);
      _p /= gcf;
      _q /= gcf;
    }

    public void add(Rational rational) {
      _q = this._q * rational._q;
      _p = this._p * rational._q + this._q * rational._p;
    }

    public void subtract(Rational rational) {
      _q = this._q * rational._q;
      _p = this._p * rational._q - this._q * rational._p;
    }
    public int compareTo(Rational rational) {
      double floatVal = floatValue();
      double ratVal = rational.floatValue();
      if (floatVal > ratVal) {
        return 1;
      } else if (floatVal == ratVal) {
        return 0;
      } else {
        return -1;
      }
    }

    public static void main(String[] args) {
        Rational rat = new Rational(3, 5);
        Rational rate = new Rational(7, 4);
        Rational ratio = new Rational(10, 13);

        System.out.println(rat.floatValue());
        System.out.println(rat.toString());
        rat.multiply(rate);
        System.out.println(rat.toString());
        rat.divide(rate);
        System.out.println(rat.toString());
        System.out.println(rat.gcd());
        rat.reduce();
        System.out.println(rat.toString());
        rat.add(rate);
        System.out.println(rat.toString());
        rat.subtract(rate);
        System.out.println(rat.toString());
        System.out.println(rat.compareTo(rate));
    }

}
