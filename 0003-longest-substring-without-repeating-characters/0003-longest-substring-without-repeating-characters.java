class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int MaxCount = 0;
        int count = 0;
        HashMap<Character, Integer> hm =new HashMap<>();
        
        int l = 0;
        int r = 0;

        while(r < s.length())
        {
            char ch = s.charAt(r);
              if(  hm.containsKey(ch) && hm.get(ch)>=l )
            {
              l =  hm.get(ch) +1;
              
                hm.replace(ch,r);
            }
            else
            {
                hm.put(ch, r);
               
            }
           

            MaxCount = Math.max(MaxCount, r - l + 1);
            r++;

        }
        return MaxCount;
        
    }
}