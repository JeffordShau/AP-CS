/*
Jefford Shau
APCS
HW28 -- Coding Bat
2020-10-30
*/

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
*/

public class xyzThere {

  public static boolean xyzThere(String str) {
    for(int count = 0; count < str.length() - 2; count ++) {
      if (str.substring(count, count + 3).equals("xyz")) {
        if (count == 0) {
          return true;
        } else {
          if (!(str.substring(count - 1, count).equals("."))) { // strange that the not operator worked while != didn't
            return true;
        }
      }
    }
  }
  return false;
}

  public static void main(String[] args) {
    System.out.println(xyzThere("abcxyz")); // → true
    System.out.println(xyzThere("abc.xyz")); //  → false
    System.out.println(xyzThere("xyz.abc")); // → true
  }
}
