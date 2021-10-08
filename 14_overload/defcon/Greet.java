/*
Triple J: Jeffery Tang & Mathias, Jefford Shau & Dylan, Jun Hong Wang & Bob
APCS
HW14 -  Default Constructor
2021-10-07
*/
/*
DISCO: got an error: error: cannot find symbol. this made me notice that the variable had to be defined before the default constructor and not inside. 
QCC: why can you not define variables inside the default constructor if the default constructor is accessible by the other methods anyway? 
*/

public class Greet {
public static void main( String[] args) {
  String greeting;
  BigSib richard = new BigSib();
  BigSib grizz = new BigSib();
  BigSib dotCom = new BigSib();
  BigSib tracy = new BigSib();
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
