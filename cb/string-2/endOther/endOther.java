/*
Jefford Shau
APCS
HW28 -- Coding Bat
2020-10-30
*/

/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
*/

public class endOther {

  public static boolean endOther(String a, String b) {
    String aCase = a.toLowerCase();
    String bCase = b.toLowerCase();
    if (aCase.length() < bCase.length()) {
      if (bCase.substring(bCase.length() - aCase.length()).equals(aCase)) {
        return true;
      }
    } else {
      if (aCase.substring(aCase.length() - bCase.length()).equals(bCase)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(endOther("Hiabc", "abc")); // → true
    System.out.println(endOther("AbC", "HiaBc")); // → true
    System.out.println(endOther("abc", "abXabc")); // → true
    System.out.println(endOther("Hiabc", "abc")); // → true
  }
}
