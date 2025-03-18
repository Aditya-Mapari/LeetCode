class Solution {
    public int subtractProductAndSum(int n) 
    {
        int Sum = 0, Mult = 1, Diff = 0, digit = 0;

        while(n > 0)
        {
            digit = n %10;

            Sum = Sum + digit;
            Mult = Mult * digit;

            n = n/10;
        }

        Diff = Mult - Sum;

        return Diff;
    }
}