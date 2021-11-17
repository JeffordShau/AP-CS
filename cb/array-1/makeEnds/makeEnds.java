/*
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
*/

public class makeEnds {
  public static int[] makeEnds(int[] nums) {
    return new int[] {nums[0], nums[nums.length - 1]}; 
  }
  
  public static void main(String[] args) {
    System.out.println(makeEnds([1, 2, 3]); // [1, 3]
    System.out.println(makeEnds([1, 2, 3, 4]); // [1, 4]
    System.out.println(makeEnds([7, 4, 6, 2]); // [7, 2]
                        }
                       }
