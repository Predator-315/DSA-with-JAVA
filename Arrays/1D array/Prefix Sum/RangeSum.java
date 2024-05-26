//Answer 'q' queires where you need to print the sum of elements in the range of indices from l to r
//The values of l & r in queries follow 1-based indexing.
//Algo:
//1. Convert the array into Prefix Sum Array
//2. For every querry, Sum of Range = a[r]-a[l-1]

import java.util.Scanner;
class RangeSum 
{
    static void makePrefixSum(int a[])
    {
        int i;
        for(i=1;i<a.length;i++)
        {
            a[i]=a[i]+a[i-1];
        }
    }
    public static void main(String[] args) 
    {
        int a[]={0,2,1,3,2,4,5}; //for 1-based indexing
        int q,l,r;
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER THE NO. OF QUERIES");
        q=in.nextInt();
        makePrefixSum(a);
        for(int i=1;i<=q;i++)
        {
            System.out.println("ENTER THE VALUES OF L & R");
            l=in.nextInt();
            r=in.nextInt();
            System.out.println("SUM OF ELEMENTS IN THE RANGE OF L TO R= "+(a[r]-a[l-1]));
        }
        in.close();
        
    }
}
