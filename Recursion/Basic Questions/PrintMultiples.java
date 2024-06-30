//Print k multiples of a number.
class PrintMultiples 
{
    static void printMultiples(int n,int k)
    {
        //base case
        if(k==0)
        return;
        //subproblem
        printMultiples(n, k-1);
        //self-work
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) 
    {
        int n=12,k=5;
        printMultiples(n, k);
    }
}
//Time complexity: O(k)
//Space complexity: O(k)