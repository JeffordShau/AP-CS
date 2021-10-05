/*
BeepBoop: Jefford & Dylan, Anthony & Corn, Jeffery & Matthias
APCS
HW10 -- Return BigSib to SOP Greet
2021-10-04
*/

/*
Discoveries: when compiling this file, both Greet.java and BigSib.java are being compilied. Able to reference a class under the same directory in different file. 
Unresolved Questions: 
*/

public class Greet {
    public static void main( String[] args ){
        System.out.println( BigSib.greet("Crosby") );
        System.out.println( BigSib.greet("Stills") );
        System.out.println( BigSib.greet("Nash") );
    }
}
