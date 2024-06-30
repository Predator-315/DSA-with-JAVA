class CheckArraySorted 
{
    static boolean checkSorted(int a[],int i)
    {
        //base case
        if(i==a.length-1)
        return true;
        //subproblem 
        if(a[i]<a[i+1])
        return checkSorted(a, i+1);
        else
        return false;
    }
    public static void main(String[] args) 
    {
        int a[]={1,4,6,78,90,130};
        if(checkSorted(a, 0))
        System.out.println("ARRAY SORTED");
        else
        System.out.println("ARRAY NOT SORTED");
    }
}
//Time complexity: O(n)
//Space complexity: O(n)