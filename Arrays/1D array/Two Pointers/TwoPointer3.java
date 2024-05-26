//Given an array sorted in non-decreasing order,return an array of the squares of each element sorted in non-decreasing order.
//Algo:
//1. Take two pointers at both ends
//2. Traverse the array till left <= right
//3. if abs(a[left]) < abs(a[right]) then push right^2 into result[] & decrement right else push left^2 into result[] & increment left

class TwoPointer3 
{
    static void swap(int a[],int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static int[] arrange(int a[])
    {
        int result[]=new int[a.length];
        int i,left=0,right=a.length-1;
        i=a.length-1;
        while(left<=right)
        {
            if(Math.abs(a[left])<Math.abs(a[right]))
            {
                result[i--]=a[right]*a[right];
                right--;
            }
            else
            {
                result[i--]=a[left]*a[left];
                left++;
            }
        }
        // result[i]=a[right]*a[right];
        return result;
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
        int a[]={-10,-3,-2,1,4,5,20};
        System.out.println("ORIGINAL ARRAY");
        printArray(a);
        int result[]=arrange(a);
        System.out.println("ARRANGED ARRAY");
        printArray(result);
    }
}