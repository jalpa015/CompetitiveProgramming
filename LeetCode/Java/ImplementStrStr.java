/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */

class ImplementStrStr{
    public int strStrI(String haystack, String needle) {
        if(needle == null || needle.length() == 0 || haystack.equals(needle))
            return 0;
        int out = -1;

        for(int i = 0; i < haystack.length() - needle.length()+1; i++) {
            if(haystack.substring(i, i+needle.length()).equals(needle))
                return i;
        }

        return out;
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0){
            return 0;
        }
        for (int i = 0; i < haystack.length(); i ++){
            if (i + needle.length() > haystack.length()){
                return -1;
            }
            for (int j = 0; j < needle.length(); j ++){
                if ( haystack.charAt(i + j) == needle.charAt(j) ){
                    if (j == (needle.length() -1)){
                        return i;
                    }
                }
                else{
                    break;
                }
            }
        }
        return -1;
    }

    public static void main(){
        ImplementStrStr implementStrStr = new ImplementStrStr();
        implementStrStr.strStr("hello","ll");
    }
}