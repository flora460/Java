/*
 * Two Sum
 */

import java.util.Arrays;

class TwoSum {
  public static int[] twoSum(int[] nums, int target) {

    int[] result = new int[2];

    for (int i = 0; i < nums.length; i++) {
      int search = target - nums[i];

      for (int j = i + 1; j < nums.length; j++) {
        if (search == nums[j]) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {

    int[] nums = { 2, 7, 11, 15 };
    int target = 9;
    System.out.println(Arrays.toString(twoSum(nums, target)));
  }
}