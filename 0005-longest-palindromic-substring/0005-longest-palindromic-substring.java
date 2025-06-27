class Solution {
   public boolean isPalindrome(String s)
   {
        if(s.length() == 0 || s.length() == 1)
        {
            return true;
        }
        int left = 0;
        int right = s.length()-1;

        while(left <= right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
   }
    public String longestPalindrome(String s) 
    {
        
        if(s.length() == 0 || s.length() == 1)
        {
           return s.substring(0, 1);
        }
        String Longest = "";
       
       for(int i = 0; i<s.length(); i++)
       {
            
            
            for(int j = i; j<s.length(); j++)
            {
                
                String sub = s.substring(i,j+1);

                if(isPalindrome(sub) && sub.length() > Longest.length() )
                {
                    Longest = sub;
                }
            }
       }
      
       return Longest;

    }
}