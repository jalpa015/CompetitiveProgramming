/*
Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.

For each kid check if there is a way to distribute extraCandies among the kids
such that he or she can have the greatest number of candies among them.
Notice that multiple kids can have the greatest number of candies.

Example 1:
    Input: candies = [2,3,5,1,3], extraCandies = 3
    Output: [true,true,true,false,true]
    Explanation:
    Kid 1 has 2 candies and if he or she receives all extra candies (3) will have 5 candies --- the greatest number of candies among the kids.
    Kid 2 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
    Kid 3 has 5 candies and this is already the greatest number of candies among the kids.
    Kid 4 has 1 candy and even if he or she receives all extra candies will only have 4 candies.
    Kid 5 has 3 candies and if he or she receives at least 2 extra candies will have the greatest number of candies among the kids.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Find maximum number of array and save it into a variable.
Iterate through it the second time and check if ith value + extra candies is equal to or greater than the maximum value of the array
store the result in corresponding boolean array
 */
public class KidsWithGreatestNumberOfCandies {

    public static void main(String[] args){

        int[] candies={2,3,5,1,3};
        List<Boolean> solutionList = kidsWithCandies(candies,3);

        System.out.println(solutionList);

    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        for (int candy : candies) System.out.println(candy);
        List<Boolean> solutionList = new ArrayList<>();
        int maximumValue = candies[0];
        for (int i=1; i<candies.length; i++) {
            if (maximumValue < candies[i]){
                maximumValue = candies[i];
            }
        }

        for (int j : candies) {
            if ((j + extraCandies) < maximumValue){
                solutionList.add(Boolean.FALSE);
            } else {
                solutionList.add(Boolean.TRUE);
            }
        }
        return solutionList;
    }
}
