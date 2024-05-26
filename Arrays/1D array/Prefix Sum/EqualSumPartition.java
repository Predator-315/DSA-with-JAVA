class EqualSumPartition 
{
    static boolean checkEqualSumPartition(int a[])
    {
        int i,prefix_sum=0,suffix_sum,totalSum=0;
        for(i=0;i<a.length;i++)
        {
            totalSum+=a[i];
        }
        for(i=0;i<a.length-1;i++)
        {
            prefix_sum+=a[i];
            suffix_sum=totalSum-prefix_sum;    
            if(prefix_sum==suffix_sum)
            return true;
        }
        return false;
    }
    public static void main(String[] args) 
    {
       int a[]={15,5,6,4,8,2};
       if(checkEqualSumPartition(a))
       System.out.println("PARTITION POSSIBLE");
       else
       System.out.println("PARTITION NOT POSSIBLE"); 
    }
}
