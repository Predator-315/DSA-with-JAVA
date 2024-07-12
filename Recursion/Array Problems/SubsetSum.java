//Print the sum of all subsets in an array(in any order).
//Sample Input: arr=[2,4,5]
//Sample Output: 0, 2, 4, 5, 6, 7, 9, 11 
class SubsetSum 
{
    static void printSum(int a[],int i,int sum)
    {
        //base case
        if(i==a.length)
        {
            System.out.println(sum);
            return;
        }
        //subproblem + self-work
        printSum(a,i+1,sum+a[i]);
        printSum(a, i+1, sum);
    }
    public static void main(String[] args) 
    {
        int a[]={2,4,5};
        printSum(a, 0, 0);
    }
}
//Time complexity: O(2^n)
//Space complexity: O(n)

//             f([2,3],0,0)
//   f([3],1,2)            f([3],1,0)
//f([],2,5) f([],2,2)    f([],2,3) f([],2,0)