class Solution {
    public boolean isPalindrome(String s) 
    {
        if(s.length() == 1)
        {
            return true;
        }

        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                sb.append(ch);
            }
            else if (ch>='A' && ch<='Z')
            {
                ch = (char)(ch + 32);
                sb.append(ch);
            }
            else if(ch>='0' && ch<='9')
            {
                sb.append(ch);
            }
        }
        

        int start  = 0;
        int end = sb.length()-1;

        while(start <= end)
        {
            if(sb.charAt(start) != sb.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        

        return true;
    }
}