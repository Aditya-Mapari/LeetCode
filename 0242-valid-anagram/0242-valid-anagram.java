class Solution {
    public boolean isAnagram(String s, String t) 
    {
        HashMap<Character, Integer> hs = new HashMap<>();

        for(int i= 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(hs.containsKey(ch) == true)
            {
                hs.put(ch,hs.get(ch) + 1);
            }
            else
            {
                hs.put(ch,1);
            }
        }

        for(int i = 0; i<t.length(); i++)
        { 
            char ch = t.charAt(i);

            if(hs.containsKey(ch) == true)
            {
                if(hs.get(ch) == 1)
                {
                    hs.remove(ch);
                }
                else
                {
                    hs.put(ch, hs.get(ch) -1);
                }
            }
            else
            {
                return false;
            }
        }
        if(hs.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}