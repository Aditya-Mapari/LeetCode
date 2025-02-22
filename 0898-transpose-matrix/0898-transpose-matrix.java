class Solution {
    public int[][] transpose(int[][] matrix) 
    {
        int Row = matrix.length;
        int Column = matrix[0].length;

        int [][] arr = new int[Column][Row];

        for(int i = 0; i<Row; i++)
        {
            for(int j = 0; j<Column; j++)
            {
                arr[j][i] = matrix[i][j];
            }
        }

        return arr;
    }
}