class ReverseInteger {

    /*
        Given a 32-bit signed integer, reverse digits of an integer.

        Example 1:

        Input: 123
        Output: 321
        Example 2:

        Input: -123
        Output: -321
        Example 3:

        Input: 120
        Output: 21
     */
    int reverse(int x) {
        int num = x;
        if (num < 0) {
            num = 0 - num;
        }
        int output = 0;
        while (num > 0) {
            if (output > Integer.MAX_VALUE / 10)
                return 0;
            output = output * 10;
            if (output > (Integer.MAX_VALUE - (num % 10)))
                return 0;
            output += num % 10;
            num = num / 10;
        }
        if (x < 0)
            return 0 - output;
        else
            return output;
    }

    //Submitted code:
    public int reverseSubmitted(int x) {
        boolean isNegative = x < 0;
        if(isNegative){
            x = x * -1;
        }
        int reverse = 0;
        int lastDigit = 0;
        int flag = 0;
        while (x >= 1) {
            lastDigit = x % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            if ((reverse - lastDigit)/10 != flag)
            {
                return 0;
            }
            flag = reverse;
            x = x / 10; // get rid of last digit
        }

        return isNegative ? reverse*-1 : reverse;
    }
}
