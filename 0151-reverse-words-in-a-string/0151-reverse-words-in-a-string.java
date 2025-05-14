class Solution {
    public String reverseWords(String s) 
    {
        String[] arr = s.split("\\s+");
       StringBuilder sobj = new StringBuilder("");

       for(int i = arr.length-1; i>=0; i--)
       {
            sobj.append(arr[i]+" ");
       }
       String ans = sobj.toString();

       ans = ans.trim();
       return ans;

       
    }
}