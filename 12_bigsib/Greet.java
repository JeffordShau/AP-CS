/*
Triple J: Jeffery Tang & Mathias, Jefford Shau & Dylan, Jun Hong Wang & Bob
APCS
HW12 -  Greet v3
2021-10-05
*/

/*
DISCO: The helloMsg instance variable must be defined outside of both methods and inside of the class BigSib to be used by the greet method and the setHelloMsg method. 
Defining the "richard" variable as the BigSib function worked smoothly. 
QCC: Why use "richard" variable instead of BigSib. ?
*/

public class Greet {
    public static void main( String[] args ){
        String greeting;
        BigSib richard = new BigSib();

        richard.setHelloMsg("Word up");
        greeting = richard.greet("freshman");
        System.out.println(greeting);

        richard.setHelloMsg("Salutations");
        greeting = richard.greet("Dr. Spaceman");
        System.out.println(greeting);

        richard.setHelloMsg("Hey ya");
        greeting = richard.greet("Kong Fooey");
        System.out.println(greeting);

        richard.setHelloMsg("Sup");
        greeting = richard.greet("mom");
        System.out.println(greeting);

  } //end main()
} //end Greet
