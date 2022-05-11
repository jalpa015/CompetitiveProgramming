/*
You are given an integer num. You will apply the following steps exactly two times:
    Pick a digit x (0 <= x <= 9).
    Pick another digit y (0 <= y <= 9). The digit y can be equal to x.
    Replace all the occurrences of x in the decimal representation of num by y.
    The new integer cannot have any leading zeros, also the new integer cannot be 0.
    Let a and b be the results of applying the operations to num the first and second times, respectively.
Return the max difference between a and b.
 */

/*
Example 1:
    Input: num = 555
    Output: 888
    Explanation: The first time pick x = 5 and y = 9 and store the new integer in a.
    The second time pick x = 5 and y = 1 and store the new integer in b.
    We have now a = 999 and b = 111 and max difference = 888

Example 2:
    Input: num = 9
    Output: 8
    Explanation: The first time pick x = 9 and y = 9 and store the new integer in a.
    The second time pick x = 9 and y = 1 and store the new integer in b.
    We have now a = 9 and b = 1 and max difference = 8

Example 3:
    Input: num = 123456
    Output: 820000

Example 4:
    Input: num = 10000
    Output: 80000

Example 5:
    Input: num = 9288
    Output: 8700
 */

/*
Replace the first digit from left with 9
If the digits from 2nd digit are not all zeros then replace the second digit with 0
if all digits are same then replace it with 1
if all digits from 2nd digit are zeros then replace first digit with 1
 */

// https://leetcode.com/problems/max-difference-you-can-get-from-changing-an-integer/

import java.util.ArrayList;
import java.util.List;

public class MaxDifferenceFromChangingInteger {

    public static void main(String[] args){

    }

    private static int maxDiff(int num) {
        int result = 0;
        List<Integer> numList = new ArrayList<>();
        int input = num;
        while (num > 0){
            numList.add(num%10);
            num = num / 10;
        }
        int firstDigit = numList.get(0);
        int digitSame = 0, digitZeros = 0;
        for (int i=1; i<numList.size(); i++) {
            if (numList.get(i) != firstDigit) {
                digitSame=1;
                digitZeros=digitZeros+numList.get(i);
            }
        }

        if (digitSame == 0) {
            // all digits are same
            // x=firstDigit and y=9 and y=1 irrespectively
        } else {
            if (digitZeros == 0) {
                
            } else {

            }
        }
        return result;
    }
}
