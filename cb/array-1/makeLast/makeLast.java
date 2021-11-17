/*
Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
*/

public class makeLast {
  public static int[] makeLast(int[] nums) {
    int[] nArray = int[2 * nums.length];
    nArray[2 * nums.length - 1] = nums[nums.length - 1];
    return nArray; 
  }
  
  public static void main(String[] args) {
    System.out.println(makeLast([4, 5, 6]); // [0, 0, 0, 0, 0, 6]
    System.out.println(makeLast([1, 2]); // [0, 0, 0, 2]
    System.out.println(makeLast([3]); // [0, 3]
