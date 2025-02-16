class Solution {
    public int maxPower(String s) 
    {
        int count = 1;
        int max = 1;

        for(int i = 1; i<s.length(); i++)
        {
            char cur = s.charAt(i);
            char prev = s.charAt(i-1);

            if(cur == prev)
            {
                count++;
            }
            else
            {
                max = Math.max(count,max);
                count = 1;
            }
        }
        max = Math.max(count,max);

        return max;

    }
}