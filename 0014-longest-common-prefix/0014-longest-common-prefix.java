class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<strs[0].length(); i++)
        {
            char ch = strs[0].charAt(i);
            for(int j = 1; j<strs.length; j++)
            {
                if( strs[j].length() > i)
                {
                    char char1 = strs[j].charAt(i);

                    if(ch != char1)
                    {
                        return sb.toString();
                    }
                }
                else
                {
                     return sb.toString();
                }

               
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}