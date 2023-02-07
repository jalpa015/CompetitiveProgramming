import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Link - https://leetcode.com/problems/find-all-anagrams-in-a-string/
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 *
 * Example 2:
 *
 * Input: s = "abab", p = "ab"
 * Output: [0,1,2]
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 *
 *
 *
 * Constraints:
 *
 *     1 <= s.length, p.length <= 3 * 104
 *     s and p consist of lowercase English letters.
 *     **/

public class FindAllAnagramsInString {
    //    Attempt 1 - Get substring from s and compare two array
    public boolean checkAnagram(String substring, String p) {
        char subArray[] = substring.toCharArray();
        char pArray[] = p.toCharArray();
        Arrays.sort(subArray);
        Arrays.sort(pArray);
        return Arrays.equals(subArray,pArray);
    }


    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        int plength = p.length();

        for (int i=0; i<=s.length(); i++) {
            if (i+plength <= s.length()) {
                String substring = s.substring(i, i+plength);
                if (checkAnagram(substring, p) ) {
                    result.add(i);
                }
            }
        }

        return result;

    }
}
