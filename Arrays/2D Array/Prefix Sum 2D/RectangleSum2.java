//In a given matrix of r*c, calculate the sum of rectangle bounded by regoin(l1,r1) & (l2,r2)
//Given l2>l1 & r2>r1
//Given 0 <= l1,l2 < r
//Given 0 <= r1,r2 < c

//Approach 2
class RectangleSum2 
{
    static void makePrefixSumByRow(int a[][])
    {
        int r=a.length,c=a[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=1;j<c;j++)
            {
                a[i][j]+=a[i][j-1];
            }
        }
    }
    static void makePrefixSumByRowColumn(int a[][])
    {
        makePrefixSumByRow(a);
        int r=a.length,c=a[0].length;
        for(int i=0;i<c;i++)
        {
            for(int j=1;j<r;j++)
            {
                a[j][i]+=a[j-1][i];
            }
        }
    }
    static int rectangleSum(int a[][],int l1,int r1,int l2,int r2)
    {
        makePrefixSumByRowColumn(a);
        int sum=0,left=0,up=0,leftUp=0;
        if(l1>0)
        up=a[l1-1][r2];
        if(r1>0)
        left=a[l2][r1-1];
        if(l1>0 && r1>0)
        leftUp=a[l1-1][r1-1];
        sum=a[l2][r2]-left-up+leftUp;  
        return sum;
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
        int l1=0,r1=1,l2=2,r2=3;
        int a[][]={{1,2,3,4,17},{5,6,7,8,18},{9,10,11,12,19},{13,14,15,16,20}};
        printMatrix(a);
        System.out.println("SUM OF RECTANGLE= "+rectangleSum(a, l1, r1, l2, r2));
    }
}

