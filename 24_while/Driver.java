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

/***
    driver for class Coin
    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run. Note anything notable.
    2. Move the "TOP" line down, so that it is below the first statement.
    (emacs: with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    (your editor: ???)
    3. Compile and run again.
    4. Resolve errors one at a time until it works.
    5. Repeat 2-4 until TOP meets BOTTOM.
***/

public class Driver {

  public static void main( String[] args ) {

      // Flip until x amount of heads appears
      Coin bob = new Coin();
      Coin cod = new Coin();
      int flipMin = 50;
      int flipsCounter = 0;
      int headsCounter = 0;
      while (headsCounter < flipMin) {
        bob.flip();
        cod.flip();
        flipsCounter += 2;
        if (bob.flip() == "heads") {
          headsCounter += 1;
        }
        if (cod.flip() == "heads") {
          headsCounter += 1;
        }
      }
     System.out.println("Total Flip Count: "+ flipsCounter);
     System.out.println("Heads Count: "+ headsCounter);

      //Flip until y amount of matches
      bob.reset("heads", 0.5);
      flipMin = 50;
      flipsCounter = 0;
      headsCounter = 0;
      int matches = 0;
      while (matches < flipMin){
        bob.flip();
        cod.flip();
        flipsCounter += 2;
        if (bob.equals(cod) ) {
          matches += 1;
        }
      }
      System.out.println("Matchee matchee!");
      System.out.println("Total Flip Count: "+ flipsCounter);
      System.out.println("Total Matchees: " + matches);

      //Flip until 65536 matches have occured and hte number of matches is divisible by the year of your birth
      flipsCounter = 0;
      headsCounter = 0;
      matches = 1;
      while (matches < 65536) {
        bob.flip();
        cod.flip();
        flipsCounter += 2;
        if (bob.equals(cod) ) {
          matches += 1;
        }
      }
      while (matches % 2005 != 0) {
        bob.flip();
        cod.flip();
        flipsCounter += 2;
        if (bob.equals(cod) ) {
          matches += 1;
        }
      }
      System.out.println("Matchee matchee!");
      System.out.println("Total Matchees: " + matches);
      System.out.println("Total Flip Count: "+ flipsCounter);

  }//end main()

}//end class
