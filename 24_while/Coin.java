/*
JJ: (Jefford Shau and Jomin Zhang )
APCS
HW24 -- While Loop
2020-10-22
time spent: 0.8 hours
 */

/*
DISCO: 
  0. Incorporated while loops into our code to terminate under the given boolean expressions. 
  1. Trying to access private instance variables results in error. 
QCC:
  0. How can we answer the third problem by only using 1 while loop instead of 2? 
*/

public class Coin {
  private double value; // monetary worth
  private String upFace; // face showing currently
  private String name; // name of coin
  private int flipCtr; // times coin was flipped
  private int headsCtr; // times coin was heads
  private int tailsCtr;  // times coin was tails
  private double bias; // likelihood of landing heads (1.0) or tails (0.0) every flip

  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
    name = "null";
    flipCtr = 0;
    headsCtr = 0;
    tailsCtr = 0;
    bias = 0.5;
    upFace = "heads";
    value = 0;
  }

  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
    name = s;
    flipCtr = 0;
    headsCtr = 0;
    tailsCtr = 0;
    bias = 0.5;
    upFace = "heads";
    value = assignValue(s);
  }

  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    name = s;
    flipCtr = 0;
    headsCtr = 0;
    tailsCtr = 0;
    bias = 0.5;
    upFace = nowFace;
    value = assignValue(s);
  }
  // Accessors...
  // ----------------------------
  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }
  // ----------------------------

  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue(String s ) {
    if (s == "penny") {
      value = .01;
    }
    else if (s == "nickel") {
      value = .05;
    }
    else if (s == "dime") {
      value = .1;
    }
    else if (s == "quarter") {
      value = .25;
    }
    else if (s == "half dollar") {
      value = .5;
    }
    else if (s == "dollar") {
      value = 1;
    }
    return value;
  }

  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset(String s, double d ) {
    flipCtr = 0;
    headsCtr = 0;
    tailsCtr = 0;
    bias = d;
    upFace = s;
    }

  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {
    flipCtr += 1;
    if (Math.random() <= bias) {
      headsCtr += 1;
      upFace = "heads";
    } else {
      tailsCtr += 1;
      upFace = "tails";
    }
    return upFace;
  }

  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals(Coin other) {
    return this.upFace == other.upFace; // this refers to this coin
  }
  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    return name + " -- " + upFace;
  }

}//end class
