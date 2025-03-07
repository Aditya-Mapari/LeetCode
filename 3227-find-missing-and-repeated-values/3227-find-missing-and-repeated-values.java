class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int n = grid.length;
        int []arr = new int [n*n+1];

        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = 0;
        }
        for(int i = 0; i<n; i++)
        {
            for(int j=0; j<n ; j++)
            {
               arr[grid[i][j]]++;
            }
        }
        int []arr2 = new int[2];
        int count = 0;
        for(int i =1; i<arr.length; i++)
        {
            if(arr[i] == 2)
            {
                arr2[0] = i;
                count++;
            }
            if(arr[i] == 0)
            {
                arr2[1] = i;
                count++;

            }
            if(count == 2)
            {
                break;
            }
        }

        return arr2;
    }
}