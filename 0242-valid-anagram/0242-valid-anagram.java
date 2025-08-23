class Solution {
    public boolean isAnagram(String s, String t) 
    {
       char[] str1 = s.toCharArray();

       Arrays.sort(str1);

       char[] str2 = t.toCharArray();

       Arrays.sort(str2);

        int i = 0;
        int j = 0;
       while(i < str1.length && j < str2.length)
       {
            char ch1 = str1[i];
            char ch2 = str2[j];

            if(ch1 != ch2)
            {
                return false;
            }
            i++;
            j++;
       }
       if(i < str1.length || j < str2.length)
       {
            return false;
       }
       return true;
    }
}