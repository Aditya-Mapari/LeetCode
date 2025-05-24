class Solution {
    public int climbStairs(int n){
        if(n<=3)
        {
            return n;
        }

        int first = 2;
        int second = 3;

        int result = 0;

        for(int i = 4; i<=n; i++)
        {
            result = first + second;
            first = second;
            second = result;
        }
        return second;
    }
}