/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
*/

public class middleWay {
  public static int[] middleWay(int[] a, int[] b) {
    return new int[] {a[1], b[1]};
  }
  
  public static void main(Sring[] args) {
    System.out.println(middleWay([1, 2, 3], [4, 5, 6]); // [2, 5]
    System.out.println(middleWay([7, 7, 7], [3, 8, 0]); // [7, 8]
    System.out.println(middleWay([5, 2, 9], [1, 4, 5]); // [2, 4]
