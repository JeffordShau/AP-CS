/*
Jefford Shau
APCS
HW28 -- Coding Bat
2020-10-30
*/

/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.
*/

public class catDog {

  public static boolean catDog(String str) {
  int dogCounter = 0;
  int catCounter = 0;
    for(int count = 0; count < str.length() - 2; count ++) {
      if (str.substring(count, count + 3).equals("cat")) {
        catCounter ++;
      }
      if (str.substring(count, count + 3).equals("dog")) {
        dogCounter ++;
      }
    }
    // System.out.println(catCounter);
    // System.out.println(dogCounter);
    return catCounter == dogCounter;
}

  public static void main(String[] args) {
    System.out.println(catDog("catdog")); // -> "true"
    System.out.println(catDog("catcat")); // -> "false"
    System.out.println(catDog("1cat1cadodog")); // -> "true"
    System.out.println(catDog("catcat")); // -> "true"
  }
}
