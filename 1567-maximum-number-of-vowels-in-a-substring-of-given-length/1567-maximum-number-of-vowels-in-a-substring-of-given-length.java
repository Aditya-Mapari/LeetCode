class Solution {
    public int maxVowels(String s, int k) 
    {
        

        int count = 0;
        int MaxCount = 0;

        for(int i = 0; i<k; i++)
        {
            
            if(isVowel(s.charAt(i)))
            count++;
        }
        MaxCount = count;

        for(int i = k; i<s.length(); i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
            if(isVowel(s.charAt(i-k)))
            {
                count--;
            }
            MaxCount = Math.max(count, MaxCount);
        }
        return MaxCount;
        
    }
    private Boolean isVowel(char ch)
    {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}