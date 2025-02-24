class Solution {
    public int maxArea(int[] height) 
    {
        int  Maxwater=0;
        int start = 0;
        int end = height.length-1;

        while(start <= end)
        {
            int h = Math.min(height[start], height[end]);
            int width = end - start;

            int curcap = h * width;

            Maxwater = Math.max(curcap, Maxwater);


            if(height[start] < height[end])
            {
                start++;
            }
            else
            {
                end--;
            }

           
        }
      
        return Maxwater;
    }
}