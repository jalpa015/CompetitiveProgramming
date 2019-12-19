public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3, 2, 4}, 6);
        System.out.print("TWO SUM OUTPUT:");
        for (int num : result) {
            System.out.print(" " + num);
        }
        System.out.println();
        TwoSumII twoSumII = new TwoSumII();
        int[] twoSumResult = twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.print("TWO SUM II OUTPUT:");
        for (int num : twoSumResult) {
            System.out.print(" " + num);
        }

        System.out.println();
        ReverseInteger reverseInteger = new ReverseInteger();
        int reverseIntegerOutput = reverseInteger.reverse(1534236469);
        System.out.print("REVERSE INTEGER OUTPUT:");
        System.out.print(" " + reverseIntegerOutput);
    }
}
