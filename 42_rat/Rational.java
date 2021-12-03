/*
JWJ (Jefford Shau, William Vongphanith, Jacob Kirmayer)
APCS
HW42 -- Be More Rational
2021-12-02
time spent: 0.5 hr
*/

/*
DISCO:
  0. PRODUCES ERROR
QCC:
  0. 
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
        _p = _p * rational._p;
        _q = _q * rational._q;
    }

    public void divide (Rational rational) {
      if (rational._p == 0) {
        System.out.println("Error: cannot divide by zero.");
      } else {
        _p = _p * rational._q;
        _q = _q * rational._p;
      }
    }

    public static int gcd(int a, int b){
      if (a==b){return a;}
      else if (a>b){return gcd(a-b,b);}
      else {return gcd(b-a,a);}
    }

    public static int gcd(){
      return gcd(_p,_q);
    }

    public void reduce(){
      int commonFactor = gcd();
      _p/=commonFactor;
      _q/=commonFactor;
    }

    public void add(Rational rational){
      _q = this._q*rational._q;
      _p = this._p*rational._q+this._q*rational._p;
    }

    public void subtract(Rational rational){
      _q = this._q*rational._q;
      _p = this._p*rational._q-this._q*rational._p;
    }
    public int compareTo(Rational rational){
      float floatVal = floatValue();
      float ratVal = rational.floatValue();
      if (floatVal>ratVal){
        return 1;
      } else if (floatVal==ratVal){
        return 0;
      } else {
        return -1;
      }
    }
