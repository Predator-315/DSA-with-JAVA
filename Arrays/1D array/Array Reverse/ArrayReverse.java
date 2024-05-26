//Reverse the array without using any additional array
class ArrayReverse 
{
    static void reverseArray(int a[])
    {
        int i,temp;
        for(i=0;i<a.length/2;i++)
        {
            temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
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
