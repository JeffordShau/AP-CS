/* 
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
*/

public class rotateLeft3 {
  public static int[] rotateLeft3(int[] nums) {
    return new int[] {nums[1], nums[2], nums[0]}; 
  }
  
  public static void main(String[] args) {
    System.out.println(rotateLeft3([1, 2, 3]); // [2, 3, 1]
    System.out.println(rotateLeft3([5, 11, 9]); // [11, 9, 5]
    System.out.println(rotateLeft3([7, 0, 0]); // [0, 0, 7]
 }
                       }
