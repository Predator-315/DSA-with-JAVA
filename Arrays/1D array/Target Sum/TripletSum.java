//Count the no. of triplets whose sum is equal to given target.
class TripletSum
{
    static int count_triplet(int a[],int target)
    {
        int i,j,k,c=0;
        for(i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                for(k=j+1;k<a.length;k++)
                {
                    if(a[i]+a[j]+a[k]==target)
                    {
                        c++;
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                    }
                }
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        int a[]={1,4,5,6,3};
        int target=12;
        System.out.println("NO OF SUM TRIPLETS= "+count_triplet(a, target));
    }
}
