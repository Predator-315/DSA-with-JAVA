//Generate a matrix of size r*c filled with elements from 1 to r*c in spiral order
class GenerateSpiralMatrix 
{
    static int[][] generateSpiral(int r,int c)
    {
        int a[][]=new int[r][c];
        int firstRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1,count=1;
        while(count<=r*c) 
        {
            //first row-> leftCol to rightCol
            for(int i=leftCol;i<=rightCol && count<=r*c;i++)
            {
                a[firstRow][i]=count++;
            }
            firstRow++;

            //right column-> firstRow to bottomRow
            for(int i=firstRow;i<=bottomRow && count<=r*c;i++)
            {
                a[i][rightCol]=count++;
            }
            rightCol--;

            //bottom row(in reverse order)-> rightCol to leftCol
            for(int i=rightCol;i>=leftCol && count<=r*c;i--)
            {
                a[bottomRow][i]=count++;
            }
            bottomRow--;

            //left column(in reverse order)-> bottomRow to firstRow
            for(int i=bottomRow;i>=firstRow && count<=r*c;i--)
            {
                a[i][leftCol]=count++;
            }
            leftCol++;
       }
       return a;
    }
    static void printMatrix(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int r=7,c=7;
        int result[][]=generateSpiral(r,c);
        System.out.println("SPIRAL MATRIX:");
        printMatrix(result);
    }
}