public class Main {
    public static void main(String[] args) {
//        TwoSum twoSum = new TwoSum();
//        int[] result = twoSum.twoSum(new int[]{3, 2, 4}, 6);
//        System.out.print("TWO SUM OUTPUT:");
//        for (int num : result) {
//            System.out.print(" " + num);
//        }
//        System.out.println();
//        TwoSumII twoSumII = new TwoSumII();
//        int[] twoSumResult = twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9);
//        System.out.print("TWO SUM II OUTPUT:");
//        for (int num : twoSumResult) {
//            System.out.print(" " + num);
//        }
//
//        System.out.println();
//        ReverseInteger reverseInteger = new ReverseInteger();
//        int reverseIntegerOutput = reverseInteger.reverse(1534236469);
//        System.out.print("REVERSE INTEGER OUTPUT:");
//        System.out.print(" " + reverseIntegerOutput);
//
//        System.out.println();
//        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
//        ListNode l1 = new ListNode(2);
//        l1.next = new ListNode(4);
//        l1.next = new ListNode(3);
//        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next = new ListNode(4);
//        ListNode returnList = addTwoNumbers.addTwoNumbers(l1, l2);
//        System.out.print("ADD TWO INTEGERS OUTPUT:");
//        System.out.print(" " + returnList.val);


        BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
        int[] input = new int[]{7,1,5,3,6,4};
        int maxProfit = bestTimeToBuyAndSellStockII.maxProfit(input);
        System.out.println("Max Profit is: "+ maxProfit);

        ImplementStrStr implementStrStr = new ImplementStrStr();
        int resultIndex = implementStrStr.strStr("hello","ll");
        System.out.println("First occurance of needle in Haystack is :"+resultIndex);
    }
}
