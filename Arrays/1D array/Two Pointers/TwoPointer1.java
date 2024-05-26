//Sort an Array consisting of only 0s & 1s.
//Algo:
//1. Take two pointers at both ends
//2. Traverse the array till left < right
//3. if left==1 && right==0 then Swap them
//4. if left==0 increment left
//5. if right==1 decrement right

class TwoPointer1 
{
    static void swap(int a[],int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void sort(int a[])
    {
        int left=0,right=a.length-1;
        while(left<right)
        {
            if(a[left]==1 && a[right]==0)
            {
                swap(a,left,right);
                left++;
                right--;
            }
            if(a[left]==0)
            left++;
            if(a[right]==1)
            right--;
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
        int a[]={0,1,0,1,1,1,0,1};
        System.out.println("ARRAY BEFORE SORTING");
        printArray(a);
        sort(a);
        System.out.println("ARRAY AFTER SORTING");
        printArray(a);
    }
}