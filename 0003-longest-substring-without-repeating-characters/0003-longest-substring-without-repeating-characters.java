class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
       if(s.length() == 0) return 0;
       if(s.length() == 1) return 1;
       
        int maxLength = 0;
        Set<Character> st = new HashSet<>();
        int j = 0;
       
        int i = 0;
        for( i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

           while(st.contains(ch))
           {
                st.remove(s.charAt(j));
                j++;
           }
            
            st.add(ch);
            maxLength = Math.max(maxLength, i-j+1);
        }
       
        return maxLength;
    }
}