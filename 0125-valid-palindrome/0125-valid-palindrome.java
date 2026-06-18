class Solution {
    public boolean isPalindrome(String s) 
    {
       if(s.length() == 0)
       {
        return true;
       }

       StringBuilder sb = new StringBuilder();

       for(int i = 0; i<s.length(); i++)
       {
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch>='0' && ch<='9')
            {
                sb.append(ch);
            }
            
       }

       String result = sb.toString();
       result = result.toLowerCase();

     

       int start = 0;
        int end = result.length()-1;

        while(start < end)
        {
            char ch = result.charAt(start);
            char ch1 = result.charAt(end);

            if(ch != ch1)
            {
                return false;
            }
            start++;
            end--;
        }
       
       return true;
    }
}