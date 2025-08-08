class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        if(s.isEmpty())
        {
            return 0;
        }

        int index = 0, sign = 1 , digit = 0;

        if(index < s.length() && s.charAt(index) == '+' || s.charAt(index) == '-')
        {
            sign = s.charAt(index) == '-' ? -1 : 1;
            index++;
        }

          while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int num = s.charAt(index) - '0';

            
            if (digit > (Integer.MAX_VALUE - num) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            digit = digit * 10 + num;
            index++;
        }

        return sign * digit;
    }
}