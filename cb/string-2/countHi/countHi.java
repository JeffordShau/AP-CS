/*
Jefford Shau
APCS
HW28 -- Coding Bat
2020-10-30
*/

/*
Return the number of times that the string "hi" appears anywhere in the given string.
*/

public class countHi {

  public int countHi(String str) {
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
    return catCounter == dogCounter;
}

}

  public static void main(String[] args) {
    System.out.println(helloName("Bob")); // → "Hello Bob!"
    System.out.println(helloName("Alice")); // → "Hello Alice!"
    System.out.println(helloName("X")); // → "Hello X!"
  }
}
