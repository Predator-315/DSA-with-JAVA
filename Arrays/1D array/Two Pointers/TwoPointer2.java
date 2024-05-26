//Move all the even elements towards the beginning of the array followed by all the odd elements(relative order doesnt matters)
//Algo:
//1. Take two pointers at both ends
//2. Traverse the array till left < right
//3. if left==odd && right==even then Swap them
//4. if left==even increment left
//5. if right==odd decrement right
class TwoPointer2 
{
    static void swap(int a[],int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void arrange(int a[])
    {
        int left=0,right=a.length-1;
        while(left<right)
        {
            if(a[left]%2!=0 && a[right]%2==0)
            {
                swap(a, left, right);
                left++;
                right--;
            }
            if(a[left]%2==0)
            left++;
            if(a[right]%2!=0)
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
        int a[]={5,6,40,36,69,72,1};
        System.out.println("ARRAY BEFORE ARRANGING");
        printArray(a);
        arrange(a);
        System.out.println("ARRAY AFTER ARRANGING");
        printArray(a);
    }
}