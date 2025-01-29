class Solution {
    public String reverseWords(String s) 
    {
        String [] arr= s.split("\\s+");

        StringBuilder sboj = new StringBuilder("");

        for(int i = arr.length-1; i>=0; i--)
        {
            sboj.append(arr[i]+" ");
        }
        String ans = sboj.toString();

        ans = ans.trim();

        return ans;
    }
}