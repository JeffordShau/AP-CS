public class doubleChar {
  public static String doubleChar(String str) {
    String doubleString = "";
    for (int count = 0; count <= str.length() - 1; count ++) {
      doubleString += str.substring(count, count + 1);
      doubleString += str.substring(count, count + 1);
    }
    return doubleString;
  }

  public static void main(String[] args) {
    System.out.println(doubleChar("The"));
    System.out.println(doubleChar("AAbb"));
    System.out.println(doubleChar("Hi-There"));
  }
}
