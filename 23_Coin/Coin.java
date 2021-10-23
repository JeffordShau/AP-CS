/*
JJ: (Jefford Shau and  )
APCS
HW23 -- Coins
2020-10-22
 */

/*
DISCO: 
  0. Implemented the random class into my code to randomize the coin flips. 
QCC: 
  1. How do you compare two objects in the same method when only using one of them as arguments?
  2. How do you check if an object exists? 
*/

import java.util.Random;

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
    value = 0;
    upFace = "heads";
    name = "null";
    flipCtr = 0;
    headsCtr = 0;
    tailsCtr = 0;
    bias = 0.5;
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
    value = 0;
    upFace = "heads";
    flipCtr = 0;
    headsCtr = 0;
    tailsCtr = 0;
    bias = 0.5;
    if ((s == "penny") || (s == "nickel") || (s == "dime") || (s == "quarter") || (s == "half dollar") || (s == "dollar")) {
      name = s;
    }
  }

  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    value = 0;
    flipCtr = 0;
    headsCtr = 0;
    tailsCtr = 0;
    bias = 0.5;
    if ((s == "penny") || (s == "nickel") || (s == "dime") || (s == "quarter") || (s == "half dollar") || (s == "dollar")) {
      name = s;
    }
    upFace = nowFace;
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
    if (((s == "heads") || (s == "tails")) && (0.0 <= d && d <= 1.0)) {
        Coin reset = new Coin();
    }
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
    Random random = new Random();
    double coinFlip = random.nextDouble(); // generates double between 0 and 1
    if (coinFlip >= 0.5) {
      headsCtr += 1;
      upFace = "heads";
    } else {
      tailsCtr += 1;
      upFace = "tails";
    }
    flipCtr += 1;
    return upFace;
  }

  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals(Coin other) {
    if ((other.name != "heads") || (other.name != "tails")) {
      // if (upFace == other.upFace) {
      return true; 
      } else {
      return false; 
      }
    } else {
      return false;
    }
  }
 //
  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    return name + " -- " + upFace; 
  }

}//end class
