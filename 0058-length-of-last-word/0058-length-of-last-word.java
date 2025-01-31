class Solution {
    public int lengthOfLastWord(String s) 
    {
        int iCount  = 0;
        for(int i = s.length()-1; i>=0 ; i--)
        {
            char ch = s.charAt(i);

            if(ch != ' ')
            {
                iCount++;
            }
            else if(iCount != 0)
            {
                break;
            }
        }
        return iCount;
    }
}