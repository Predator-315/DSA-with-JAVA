//Rotate the given array by 'k' without using any additional space
//Algo:
//1. Reverse the whole array
//2. Reverse the subarray starting from 0 to k-1
//3. Reverse the subarray starting from k to n-1

class ArrayRotatingInPlace 
{
    static void rotateInplace(int a[],int k)
    {
        int n=a.length;
        k=k%n;
        reverse(a,0, n-1);
        reverse(a, 0, k-1);
        reverse(a, k, n-1);
    }
    static void reverse(int a[],int start,int end)
    {
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
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
        int k=4;
        System.out.println("ARRAY BEFORE ROTATING");
        printArray(a);
        rotateInplace(a,k);
        System.out.println("ARRAY AFTER ROTATING");
        printArray(a);
    }
}