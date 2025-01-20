class Solution {
    public void rotate(int[][] matrix) 
    {
        int n = matrix.length;

        for(int i = 0; i<n; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i<n; i++)
        {
            Reverse(matrix[i]);
        }

        
    }
    public  static void Reverse(int[]Row)
        { 
            int Start = 0 , End = Row.length-1 ;

            while(Start < End)
            {
                int temp = Row[Start];
                Row[Start] = Row[End];
                Row[End] = temp;

                Start++;
                End--;
            }
        }
}