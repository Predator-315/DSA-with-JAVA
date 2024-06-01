class MatrixMultiplication 
{
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
    static int[][] multiply(int a[][],int r1,int c1,int b[][],int r2,int c2)
    {
        int result[][]=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<r2;k++)
                {
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) 
    {
        int r1=2,c1=3,r2=3,c2=4;
        int a[][]={{1,2,3},{4,5,6}};
        int b[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        if(r2!=c1)
        System.out.println("MULTIPLICATION NOT POSSIBLE");
        else
        {
            System.out.println("MATRIX 1:");
            printMatrix(a);
            System.out.println("MATRIX 2:");
            printMatrix(b);
            int result[][]=multiply(a, r1, c1, b, r2, c2);
            System.out.println("RESULTANT MATRIX:");
            printMatrix(result);
        }
    }
}