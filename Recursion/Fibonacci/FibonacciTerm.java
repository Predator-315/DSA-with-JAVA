//Print the Nth Fibonacci term
class FibonacciTerm 
{
    static int fibonacciTerm(int n)
    {
        //base case
        if(n==0 || n==1)
        return n;
        //subproblem + self work(recurrence relation)
        return fibonacciTerm(n-1)+fibonacciTerm(n-2);
    }
    public static void main(String[] args) 
    {
        System.out.println(fibonacciTerm(7));
    }
}
//Time Complexity: O(2^n)
//Space Complexity: O(n)
//recursive tree for n=5
//                          f(5)
//              f(4)                   f(3)  
//       f(3)          f(2)        f(2)    f(1)
//   f(2)    f(1)   f(1)  f(0)  f(1)  f(0)
//f(1) f(0)