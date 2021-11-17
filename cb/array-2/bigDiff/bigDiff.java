/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
*/

public class bigDiff {
  public static int bigDiff(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    for(int idx: nums) {
      max = Math.max(max, idx); 
      min = Math.min(min, idx); 
    }
    return max - min;
  }
  
  public static void main(String[] args) {
    System.out.println(bigDiff([10 3, 5, 6]); // 7
    System.out.println(bigDiff([7, 2, 10, 9]); // 8
    System.out.println(bigDiff([2, 10, 7, 2]); // 8
                       }
                      }

                      
