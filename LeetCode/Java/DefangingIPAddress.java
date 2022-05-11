/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

Constraints:
The given address is a valid IPv4 address.
 */

public class DefangingIPAddress {
    public static void main(String[] args){
        System.out.println(defangIPaddr("1.1.1.1"));

    }

    private static String defangIPaddr(String address) {
//        char[] addressArray = address.toCharArray();
//        for (char addressChar: address) {
//
//        }
//        address = address.replace('.', "[.]");
        return address;
    }
}
