class Solution {
    public String addBinary(String a, String b) 
    {
         StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;

        // Traverse both strings from the end to the beginning
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0'; // Convert char to int
            if (j >= 0) sum += b.charAt(j--) - '0';

            result.append(sum % 2);  // Append binary digit
            carry = sum / 2;         // Compute carry
        }

        return result.reverse().toString();  // Reverse result before returning
    }
    
}