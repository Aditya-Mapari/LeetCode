class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
         if (strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                // Remove the last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, return ""
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}