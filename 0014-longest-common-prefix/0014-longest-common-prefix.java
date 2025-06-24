class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
          if (strs.length == 0) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                // If index is out of bounds or characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return result.toString();
                }
            }

            result.append(ch); // All matched, add character to result
        }

        return result.toString();
    }
}