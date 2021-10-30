/*
Jefford Shau
APCS
HW28 -- Coding Bat
2020-10-30
*/

/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
*/

public class countCode {

  public static int countCode(String str) {
    int Counter = 0;
    for(int count = 0; count < str.length() - 3; count ++) {
      if (str.substring(count, count + 2).equals("co") && str.substring(count + 3, count + 4).equals("e")) {
        Counter ++;
      }
    }
    return Counter;
}

  public static void main(String[] args) {
    System.out.println(countCode("aaacodebbb")); // → 1
    System.out.println(countCode("codexxcode")); // → 2
    System.out.println(countCode("cozexxcope")); // → 2
  }
}
