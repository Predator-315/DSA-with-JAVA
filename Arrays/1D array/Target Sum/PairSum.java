// Find the total no. of pairs in the array whose sum is equal to the given target
class PairSum 
{
    static int count_pair(int a[],int target)
    {
        int i,j,c=0;
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==target)
                {
                    c++;
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
        return c;
    }
    public static void main(String[] args) 
    {
        int a[]={4,6,3,5,8,2};
        int target=8;
        System.out.println("NO OF SUM PAIRS= "+count_pair(a, target));
    }
}