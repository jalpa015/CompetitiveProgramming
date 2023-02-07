import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *  https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 *
 *  Given a string s, find the length of the longest
 * substring
 * without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 *
 *
 *
 * Constraints:
 *
 *     0 <= s.length <= 5 * 104
 *     s consists of English letters, digits, symbols and spaces.
 */

public class LengthOfLongestSubstring {

    // Solution with better time performance and acceptance rate
    public int lengthOfLongestSubstring(String str) {
        int n = str.length();
        // Result
        int res = 0;
        ArrayList< Character > visited = new ArrayList();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (visited.contains((str.charAt(j)))) {
                    visited.clear();
                    break;
                } else {
                    visited.add((str.charAt(j)));
                    if (res < j - i + 1) {
                        res = j - i + 1;
                    }

                }
            }

        }
        return res;
    }

    //    Solution with almost double time and 60% acceptance rate
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<String> set = new HashSet<String>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(String.valueOf(s.charAt(j)))) {

                    break;
                } else {
                    set.add(String.valueOf(s.charAt(j)));
                    if (set.size() > max) {
                        max = set.size();
                    }
                }
            }
        }
        return max;
    }
}
