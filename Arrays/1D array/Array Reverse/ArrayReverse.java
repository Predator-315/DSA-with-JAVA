//Reverse the array without using any additional array
class ArrayReverse 
{
    static void reverseArray(int a[])
    {
        int start=0,temp,end=a.length-1;
        while(start<end)
        {
            temp=a[start];
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
        int a[]={1,2,3,4,5,6,7};
        System.out.println("ORIGINAL ARRAY:");
        printArray(a);
        reverseArray(a);
        System.out.println("REVERSED ARRAY:");
        printArray(a);
    }
}
