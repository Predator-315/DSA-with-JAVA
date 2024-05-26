//Rotate array by 'k' steps where k is non negative & can be greater than array-size as well
//Algo:
//1. Traverse the original array from 'n-k' to 'n-1' & place them in the new array
//2. Traverse the original array from '0' to 'n-k-1' & place them in the new array 

class ArrayRotating
{
    static void rotateArray(int a[],int result[],int k)
    {
        int i,j=0,n=a.length;
        k=k%n;
        for(i=n-k;i<n;i++)
        {
            result[j++]=a[i];
        }
        for(i=0;i<n-k;i++)
        {
            result[j++]=a[i];
        }
    }
    static void printArray(int a[])
    {
        for(int item:a)
        {
            System.out.print(item+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6};
        int b[]=new int[a.length];
        int k=4;
        System.out.println("ARRAY BEFORE ROTATING");
        printArray(a);
        rotateArray(a,b,k);
        System.out.println("ARRAY AFTER ROTATING");
        printArray(b);
    }
}