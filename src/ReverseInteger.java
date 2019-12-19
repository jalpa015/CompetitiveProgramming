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
}
