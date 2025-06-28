class Solution {
    public static boolean isPlaindrome(String ss)
    {
        if(ss.length() == 0  || ss.length() == 1)
        {
            return true;
        }
        int left = 0;
        int right = ss.length()-1;

        while(left < right)
        {
            if(ss.charAt(left) != ss.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int countSubstrings(String s) 
    {
        int count = 0;
        String sub = "";

        for(int i = 0; i<s.length(); i++)
        {
            for(int j = i; j<s.length(); j++)
            {
                sub = s.substring(i,j+1);

                if(isPlaindrome(sub))
                {
                    count++;
                }

            }
        }
        return count;

    }
    
}