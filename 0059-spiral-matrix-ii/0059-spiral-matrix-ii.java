class Solution {
    public int[][] generateMatrix(int n) 
    {
        int [][]arr = new int[n][n];

        int minRow = 0;
        int maxRow = n-1;
        int minCol = 0;
        int maxCol = n-1;
        int count = 1;

        while(count<=n*n)
        {
            for(int c = minCol; c<=maxCol; c++)
            {
                arr[minRow][c] = count;
                count++;
            }

            for(int c1 = minRow+1; c1<=maxRow; c1++)
            {
                arr[c1][maxCol] = count;
                count++;
            }

            for(int c3 = maxCol-1; c3>= minCol; c3--)
            {
                arr[maxRow][c3] = count;
                count++;
            }

            for(int c4 = maxRow-1; c4 >= minRow+1; c4--)
            {
                arr[c4][minCol] = count;
                count++;
            }

            minRow++;
            maxRow--;
            minCol++;
            maxCol--;

            
            
        }
        return arr;
    }
}