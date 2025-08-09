class Solution {
    public double myPow(double x, int n) 
    {
          long pow = n; // use long for safety
        if (pow < 0) {
            x = 1 / x;
            pow = -pow;
        }

        double ans = 1;
        while (pow > 0) {
            if ((pow & 1) == 1) { // if odd
                ans *= x;
            }
            x *= x;   // square the base
            pow >>= 1; // divide power by 2
        }
        return ans;
    }
}