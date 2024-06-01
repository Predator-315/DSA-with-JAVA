//Rotate the given sqaure matrix by 90 degree in clock-wise direction.
class MatrixRotationInPlace 
{
    static void reverse(int a[])
    {
        int temp,start=0,end=a.length-1;
        while(start<end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    static void rotateInPlace(int a[][],int r,int c)
    {
        //tranpose in-place
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
        for(int i=0;i<r;i++)
        {
            reverse(a[i]); //reversing each row
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
        rotateInPlace(a, r, c);
        System.out.println("ROTATED MATRIX");
        printMatrix(a);
    }  
}
//1  2  3  4
//5  6  7  8
//9  10 11 12
//13 14 15 16

//1 5 9  13
//2 6 10 14
//3 7 11 15
//4 8 12 16

//13 9  5 1
//14 10 6 2
//15 11 7 3
//16 12 8 4