//Calculate the prefix sum/running sum in the same array without creating a new array.
//PrefixSum of any element: Sum of all the elements from start to that element's position
//General Formula: PrefixSum(i)=a[i]+PrefixSum(i-1)
//Algo:
//Traverse the array starting from 1
//a[i]=a[i]+a[i-1]
class PrefixSum 
{
    static void prefixSum(int a[])
    {
        int i;
        for(i=1;i<a.length;i++)
        {
            a[i]=a[i]+a[i-1];
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
        int a[]={2,1,3,4,5};
        System.out.println("ORIGINAL ARRAY");
        printArray(a);
        prefixSum(a);
        System.out.println("ARRANGED ARRAY");
        printArray(a);
    }
}
