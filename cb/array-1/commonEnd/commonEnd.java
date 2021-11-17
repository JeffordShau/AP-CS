public class commonEnd {
  public static boolean commonEnd(int[] a. int[] b) {
    return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
  }
  
  public static void main(String[] args) {
    System.out.println(commonEnd([1, 2, 3], [7, 3]); // true
    System.out.println(commonEnd([1, 2, 3], [7, 3, 2]); // false
    System.out.println(commonEnd([1, 2, 3], [1, 3]); // true
