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
