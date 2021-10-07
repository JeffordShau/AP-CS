/*
Triple J: Jeffery Tang & Mathias, Jefford Shau & Dylan, Jun Hong Wang & Bob (also got help from Nafix's post on Piazza)
APCS
HW12 -- Instance Variables
2021-10-05
*/

/*
DISCO: a constructor does not have return types nor static.
a constructor must be public and before other methods
QCC: why is there no return type for a constructor, can't the return type be "void"?
*/

public class Greet {
    public static void main( String[] args ){
        String greeting;
        
        BigSib richard = new BigSib("Word up"); // Invoked by new keyword, runs when new object is introduced
        greeting = richard.greet("freshman");
        System.out.println(greeting);

        BigSib ryan =  new BigSib("Salutations");
        greeting = ryan.greet("Dr. Spaceman");
        System.out.println(greeting);

        BigSib rhino =  new BigSib("Hey ya");
        greeting = rhino.greet("Kong Fooey");
        System.out.println(greeting);

        BigSib raymond =  new BigSib("Sup");
        greeting = raymond.greet("mom");
        System.out.println(greeting);

  } //end main()
} //end Greet
