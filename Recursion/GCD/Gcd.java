//Find GCD of 2 nos. using Euclid's Algo
class Gcd 
{
    static int findGCD(int x,int y)
    {
        //base case
        if(y==0)
        return x;
        //subproblem
        return findGCD(y, x%y);
    }
    public static void main(String[] args) 
    {
        int x=24,y=15;
        System.out.println("GCD of "+x+" & "+y+" = "+findGCD(x, y));
    }
}
