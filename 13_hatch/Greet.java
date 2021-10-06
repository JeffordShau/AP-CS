/*
Triple J: Jeffery Tang & Mathias, Jefford Shau & Dylan, Jun Hong Wang & Bob
APCS
HW13 -  Greet v3
2021-10-06
*/

/*
DISCO: 
QCC: 
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
