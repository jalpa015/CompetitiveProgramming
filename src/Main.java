import java.util.*;

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


//        BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();
//        int[] input = new int[]{7,1,5,3,6,4};
//        int maxProfit = bestTimeToBuyAndSellStockII.maxProfit(input);
//        System.out.println("Max Profit is: "+ maxProfit);
//
//        ImplementStrStr implementStrStr = new ImplementStrStr();
//        int resultIndex = implementStrStr.strStr("hello","ll");
//        System.out.println("First occurrence of needle in Haystack is :"+resultIndex);

//        Scanner sc=new Scanner(System.in);
//        String s="qpwoeirutyalskdjfhgzmxncbv";
//        String a="131013090521";
//        StringBuffer res=new StringBuffer();
//        char[] arr=s.toCharArray();
//        StringBuilder temp=new StringBuilder();
//        int num=0;
//        for(int i=0;i<a.length()-1;i+=2 ){
//            temp = new StringBuilder();
//            temp.append(a.charAt(i));
//            temp.append(a.charAt(i+1));
//            num=Integer.parseInt(temp.toString());
//            res.append(arr[num-1]);
//        }
//        System.out.print(res.toString());


//        Scanner sc=new Scanner(System.in);
//        int n=5;
//        int[][] arr=new int[n][n];
//        int ch=65;
//        int num=0,j=0, k=0;
//        for(int i=1;i<=n;i++) {
//            for(int a=1;a<=i;a++) {
//                System.out.print(((char)ch)+""+"*");
//                ch=ch+1;
//                num=num+1;
//            }
////            for(int k=flag;k<=num;k++) {
////                System.out.print(k+"*");
////            }
//            // if row number is odd
//            if (i % 2 != 0) {
//
//                // print numbers with the '*'
//                // sign in increasing order
//                for (j = k + 1; j < k + i; j++)
//                    System.out.print(j + "*");
//                System.out.println(j++);
//
//                // update value of 'k'
//                k = j;
//            }
//            // if row number is even
//            else {
//                // update value of 'k'
//                k = k + i - 1;
//                // print numbers with the '*' in
//                // decreasing order
//                for (j = k; j > k - i + 1; j--)
//                    System.out.print(j + "*");
//                System.out.println(j);
//            }
//        }
//        String s="dood";
//        Stack<Integer> stack = new Stack<>();
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < s.length(); i++) {
//            if (stack.isEmpty() || chars[stack.peek()] != chars[i]) {
//                stack.push(i);
//            }
//            else {
//                chars[i] = '-';
//                chars[stack.pop()] = '-';
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (char c : chars) {
//            if (c != '-') {
//                sb.append(c);
//            }
//        }
//        if (sb.length() != 0) {
//            System.out.print(sb.toString());
//        } else {
//            System.out.print("-1");
//        }

        String s="the day is sunny the the the sunny is is";
        int n=4;
        StringBuilder sb=new StringBuilder();
        String[] sa=s.split(" ");
        List<String> al = new ArrayList<String>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //get the max frequency
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            max = Math.max(max, entry.getValue());
        }

        //initialize an array of ArrayList. index is frequency, value is list of numbers
        ArrayList<Integer>[] arr = (ArrayList<Integer>[]) new ArrayList[max+1];
        for(int i=1; i<=max; i++){
            arr[i]=new ArrayList<Integer>();
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int count = entry.getValue();
            int number = entry.getKey();
            arr[count].add(number);
        }

        List<Integer> result = new ArrayList<Integer>();

        //add most frequent numbers to result
        for(int j=max; j>=1; j--){
            if(arr[j].size()>0){
                for(int a: arr[j]){
                    result.add(a);
                    //if size==k, stop
                    if(result.size()==k){
                        return result;
                    }
                }
            }
        }
        System.out.print(al);
        for(int i=0;i<n;i++) {
            sb.append(al.get(i));
        }
        System.out.print(sb.toString());

    }
}
