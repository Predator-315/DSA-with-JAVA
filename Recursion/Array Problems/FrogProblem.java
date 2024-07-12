//There are N stones numbered from 0,1,2,..N-1. For each i(0<i<N), the height of Stone i is hi. There is a frog who is intially on Stone 0. He will repeat the following action some number of times to reach Stone N-1:
//If the frog is currently on Stone i, then it can only jump to Stone i+1 or Stone i+2. Here, a cost of |hi-hj| is incurred, where j is the stone to land on.
//Find the minimum possible total cost incurred before the frog reaches Stone N.
//Sample Input: n=4, h[]= {10,30,40,20}
//Sample Output: 30
class FrogProblem 
{
    static int findMinCost(int h[],int n,int i)
    {
        //base case1
        if(i==n-1)
        return 0;
        //self-work + subproblem1
        int cost1=Math.abs(h[i]-h[i+1])+findMinCost(h, n, i+1);
        //base case2
        if(i==n-2)
        return cost1;
        //self-work + subproblem2
        int cost2=Math.abs(h[i]-h[i+2])+findMinCost(h, n, i+2);
        return Math.min(cost1,cost2);
    }
    public static void main(String[] args) 
    {
        int h[]={10,30,40,20};
        int n=4;
        System.out.println("MIN COST TO REACH N: "+findMinCost(h, n, 0));
    }
}
//Time complexity: O(2^n)
//Space Complexity: O(n)

//                    f(a,0)30,50=30
//          f(a,1)30,10=10            f(a,2)=20
//    f(a,2)=20  f(a,3)=0   f(a,3)=0  
//f(a,3)=0 