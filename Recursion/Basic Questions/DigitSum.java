//Calculate the sum of digits of a no. using Recursion.
class DigitSum 
{
    static int digitSum(int n)
    {
        //base case
        if(n==0)
        return 0;
        //subproblem + self-work (Recurrence relation)
        return digitSum(n/10)+n%10; 
    }
    public static void main(String[] args) 
    {
        int n=456;
        System.out.println("SUM OF DIGITS: "+digitSum(n));
    }  
}
//Time complexity: O(n)
//Space complexity: O(n)