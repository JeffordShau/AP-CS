/*
Given an int array length 2, return true if it contains a 2 or a 3.
*/

public class has23 {
  public static boolean has23(int[] nums) {
    return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
  }
  
  public static void main(String[] args) {
    System.out.println(has23([2, 5]); // true
    System.out.println(has23([4, 3]); // true
    System.out.println(has23([4, 5]); // false
                        }
                       }
