/*
Jefford Shau
APCS
HW28 -- Coding Bat
2020-10-30
*/

/*
Given a string, return a string where for every char in the original, there are two chars.
*/

public class helloName {

  public String helloName(String name) {
    return "Hello " + name + "!";
  }
}

  public static void main(String[] args) {
    System.out.println(helloName("Bob")); // → "Hello Bob!"
    System.out.println(helloName("Alice")); // → "Hello Alice!"
    System.out.println(helloName("X")); // → "Hello X!"
  }
}
