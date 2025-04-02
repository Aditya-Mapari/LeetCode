class Solution {

    public void reverse(int []mat)
       {
            int start = 0;
            int end = mat.length-1;


            while(start <= end)
            {
                int temp = mat[start];
                mat[start] = mat[end];
                mat[end] = temp;

                start++;
                end--;
            }
       }
    public void rotate(int[][] matrix) 
    {
       for(int i =0; i<matrix.length; i++)
       {
            for(int j = i+1; j<matrix[0].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
       }

       for(int i = 0; i<matrix.length; i++)
       {
            reverse(matrix[i]);
       }

       
    }
}