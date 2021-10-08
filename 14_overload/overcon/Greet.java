/*
Triple J: Jeffery Tang & Mathias, Jefford Shau & Dylan, Jun Hong Wang & Bob
APCS
HW14 -  Default Constructor
2021-10-07
*/

/*
DISCO: 
QCC: 
*/

public class Greet {
public static void main( String[] args) {
  String greeting;
  BigSib richard = new BigSib("Word up");
  BigSib grizz = new BigSib("Hey ya");
  BigSib dotCom = new BigSib("Sup");
  BigSib tracy = new BigSib("Saluations");
  greeting = richard.greet("freshman");
  System.out.println(greeting);
  greeting = tracy.greet("Dr. Spaceman");
  System.out.println(greeting);
  greeting = grizz.greet("Kong Fooey");
  System.out.println(greeting);
  greeting = dotCom.greet("mom");
  System.out.println(greeting);
}
}
  
