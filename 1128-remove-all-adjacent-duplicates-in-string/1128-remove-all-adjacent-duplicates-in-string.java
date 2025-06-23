class Solution {
    public String removeDuplicates(String s) 
    {
         StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == ch) {
                // If top of stack equals current char → pop it
                sb.deleteCharAt(len - 1);
            } else {
                // Else push the character
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}