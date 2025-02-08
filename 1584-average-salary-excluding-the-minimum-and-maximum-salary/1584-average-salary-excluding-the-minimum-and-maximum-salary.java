class Solution {
    public double average(int[] salary) 
    {
        int iMin = salary[0];
        int iMax = salary[0];
        int iSum = 0;

        for(int i =0; i<salary.length; i++)
        {
            if(iMax < salary[i])
            {
                iMax = salary[i];
            }
            if(iMin > salary[i])
            {
                iMin = salary[i];
            }
            iSum = iSum + salary[i];
        }

        iSum = iSum - iMin - iMax;
      double  iResult =(double)iSum/(salary.length - 2);

        return iResult;

    }
}