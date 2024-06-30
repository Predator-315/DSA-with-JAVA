//Find the max value of the array.
class MaxValue 
{
    static void printArray(int a[],int i)
    {
        //base case
        if(i==a.length)
        return;
        //self-work
        System.out.print(a[i]+" ");
        //subproblem
        printArray(a,i+1);
    }
    static int findMax(int a[],int i)
    {
        //base case
        if(i==a.length-1)
        return a[i];
        //subproblem+self work
        return Math.max(a[i],findMax(a, i+1));
    }
    public static void main(String[] args) 
    {
        int a[]={13,25,100,43,5,6};
        printArray(a, 0);
        System.out.println("\nMAX VALUE= "+findMax(a, 0));
    }   
}
//Time complexity: O(n)
//Space Complexity: O(n)