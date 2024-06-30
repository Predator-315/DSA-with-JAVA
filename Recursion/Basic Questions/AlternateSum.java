//Given a number 'n', find the sum of all natural nos till n but with alternate signs.
//Ex- for n=10, sum= 1+2-3+4-5+6-7+8-9+10= 7

class AlternateSum 
{
    static int alternateSum(int n)
    {
        //base case
        if(n==1)
        return 1;
        //subproblem + self work
        if(n%2==0)
        return alternateSum(n-1)+n;
        else
        return alternateSum(n-1)-n;
    }
    public static void main(String[] args) 
    {
        int n=10;
        System.out.println("SUM= "+alternateSum(n));
    }
}
//Time complexity: O(n)
//Space Complexity: O(n)