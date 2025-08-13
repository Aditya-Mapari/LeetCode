class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int a1 = num1.length() - 1;
        int b1 = num2.length() - 1;

        while (a1 >= 0 || b1 >= 0) {
            int digit1 = (a1 >= 0) ? num1.charAt(a1) - '0' : 0;
            int digit2 = (b1 >= 0) ? num2.charAt(b1) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            int cal = sum % 10;

            sb.insert(0, cal);

            a1--;
            b1--;
        }

        if (carry > 0) {
            sb.insert(0, carry);
        }

        return sb.toString();

    }
}