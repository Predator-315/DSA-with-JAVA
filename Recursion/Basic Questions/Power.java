//Calculate p^q using Recursion.
class Power 
{
    //Approach 1
    static int findPower(int p,int q)
    {
        //base case
        if(q==0)
        return 1;
        //subproblem + self-work (Recurrence relation)
        return findPower(p, q-1)*p;
    }
    //Approach 2 (More Efficent)
    static int findPowerAlternative(int p,int q)
    {
        //base case
        if(q==0)
        return 1;
        //subproblem + self-work (Recurrence relation)
        int value=findPowerAlternative(p, q/2);
        if(q%2==0)
        return value*value;
        else
        return value*value*p;
    }
    public static void main(String[] args) 
    {
        int p=4,q=3;
        System.out.println(p+"^"+q+"= "+findPowerAlternative(p, q));
    }
}
//Approach 1
//Time complexity: O(q)
//Space complexity: O(q)

//Approach 2
//Time complexity: O(log q)
//Space complexity: O(log q)
 