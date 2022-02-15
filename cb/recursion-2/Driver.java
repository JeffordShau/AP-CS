/*
TNPG: LJ (Lawrence Joa, Jefford Shau)
APCS
HW64 -- Revisitation
2022-02-14
time spent: 1 hr + class time
*/

public class Driver {

  /*
  Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target? This is a classic backtracking recursion problem. Once you understand the recursive backtracking strategy in this problem, you can use the same pattern for many problems to search a space of choices. Rather than looking at the whole array, our convention is to consider the part of the array starting at index start and continuing to the end of the array. The caller can specify the whole array simply by passing start as 0. No loops are needed -- the recursive calls progress down the array.
  */
  public static boolean groupSum(int start, int[] nums, int target) {
    if (start >= nums.length) {
      return target == 0;
    }
    // chose the element at index start or don't
    return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
  }

  public static void main(String[] args) {
    System.out.println("groupSum");
    System.out.println(groupSum(0, new int[]{2, 4, 8}, 10));
    System.out.println(groupSum(0, new int[]{2, 4, 8}, 14));
    System.out.println(groupSum(0, new int[]{2, 4, 8}, 9));
    System.out.println("\n");

  }

}
