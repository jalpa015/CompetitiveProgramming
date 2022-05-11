import java.util.ArrayList;
import java.util.List;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
class TwoSum {
    int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right;
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            right = nums.length - 1;
            while (i < right) {
                int sum = nums[i] + nums[right];
                if (sum == target) {
                    output.add(i);
                    output.add(right);
                    break;
                } else {
                    right = right - 1;
                }
            }
        }

        int[] returnArr = new int[output.size()];
        for (int i = 0; i < output.size(); i++) returnArr[i] = output.get(i);
        return returnArr;
    }
}
