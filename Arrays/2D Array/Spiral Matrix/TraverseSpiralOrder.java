//Print the given matrix in its Spiral order.
class TraverseSpiralOrder
{
    static void printSpiral(int a[][],int r,int c)
    {
        int firstRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1,count=0;
        while(count<r*c) 
        {
            //first row-> leftCol to rightCol
            for(int i=leftCol;i<=rightCol && count<r*c;i++)
            {
                System.out.print(a[firstRow][i]+" ");
                count++;
            }
            firstRow++;

            //right column-> firstRow to bottomRow
            for(int i=firstRow;i<=bottomRow && count<r*c;i++)
            {
                System.out.print(a[i][rightCol]+" ");
                count++;
            }
            rightCol--;

            //bottom row(in reverse order)-> rightCol to leftCol
            for(int i=rightCol;i>=leftCol && count<r*c;i--)
            {
                System.out.print(a[bottomRow][i]+" ");
                count++;
            }
            bottomRow--;

            //left column(in reverse order)-> bottomRow to firstRow
            for(int i=bottomRow;i>=firstRow && count<r*c;i--)
            {
                System.out.print(a[i][leftCol]+" ");
                count++;
            }
            leftCol++;
       } 
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
        int r=3,c=4;
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("THE MATRIX:");
        printMatrix(a);
        System.out.println("SPIRAL ORDER:");
        printSpiral(a,r,c);
    } 
}