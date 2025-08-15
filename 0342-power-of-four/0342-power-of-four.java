class Solution {
    public boolean isPowerOfFour(int n) {
        int i = 0;
        if(n <= 0)
        {
            return false;
        }
        while(Math.pow(4,i) <= n)
        {
            if(Math.pow(4,i) == n)
            {
                return true;
            }
            i++;
        }
        return false;
        
    }
    
    
}