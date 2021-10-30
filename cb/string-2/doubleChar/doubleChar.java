/*
Jefford Shau
APCS
HW28 -- Coding Bat
2020-10-30
*/

/*

Given a string, return a string where for every char in the original, there are two chars.
*/

public class doubleChar {

  public String doubleChar(String str) {
    String doubleString = "";
    for (int count = 0; count <= str.length() - 1; count ++) {
      doubleString += str.substring(count, count + 1);
      doubleString += str.substring(count, count + 1);
    }
    return doubleString;
  }
}

  public static void main(String[] args) {
    System.out.println(doubleChar("The")); // -> "TThhee"
    System.out.println(doubleChar("AAbb")); // -> "AAAAbbbb"
    System.out.println(doubleChar("Hi-There")); // -> "TThheerree"
  }
}
