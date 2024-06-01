class MatrixTransposeInPLace 
{
    static void transposeInPlace(int a[][],int r,int c)
    {
        int temp;
        for(int i=0;i<r;i++)
        {
            for(int j=i;j<c;j++)
            {
                temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;      
            }
        }
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
        int r=3,c=3;
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("ORIGINAL MATRIX:");
        printMatrix(a);
        transposeInPlace(a, r, c);
        System.out.println("TRANSPOSED MATRIX");
        printMatrix(a);
    }
}