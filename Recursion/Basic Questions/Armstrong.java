class Armstrong 
{
    static int findDigits(int n)
    {
        //base case
        if(n==0)
        return 0;
        //subproblem + self-work
        return findDigits(n/10)+1;
    }
    static int findSum(int n,int c)
    {
        //base case
        if(n==0)
        return 0;
        //subproblem + self-work
        return findSum(n/10, c)+ (int)Math.pow(n%10,c);
    }
    public static void main(String[] args) 
    {
        int n=1634;
        if(findSum(n, findDigits(n))==n)
        System.out.println("Armstrong No.");
        else
        System.out.println("Non-Armstrong Mo.");
    }
}
