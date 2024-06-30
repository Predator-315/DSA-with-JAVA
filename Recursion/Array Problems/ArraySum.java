class ArraySum 
{
    static int findSum(int a[],int i)
    {
        //base case
        if(i==a.length)
        return 0;
        //subproblem + self-work
        return a[i]+findSum(a, i+1);
    }
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5};
        System.out.println("SUM= "+findSum(a, 0));
    }
}
//Time complexity: O(n)
//Space complexity: O(n)