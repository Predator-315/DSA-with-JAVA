class MatrixTranspose 
{
    static int[][] transpose(int a[][],int r,int c)
    {
        int result[][]=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                result[i][j]=a[j][i];
            }
        }
        return result;
    }
    static void printMatrix(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int r=2,c=3;
        int a[][]={{1,2,3},{4,5,6}};
        System.out.println("ORIGINAL MATRIX:");
        printMatrix(a);
        int result[][]=transpose(a, r, c);
        System.out.println("TRANSPOSED MATRIX");
        printMatrix(result);
    }
}