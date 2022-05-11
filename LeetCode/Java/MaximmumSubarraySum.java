public class MaximmumSubarraySum {

    public static void main(String[] args){
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));

    }

    public static int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        int cur = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            cur = Math.max(nums[i], cur + nums[i]);
            max = Math.max(max, cur);
        }

        return max;
    }
    // first submission but time limit exceeded
    public int maxSubArrayI(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}
