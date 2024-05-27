//Check if we can partition the array into two subarrays with equal sum. More,fomrally, check that the prefix sum of a part of array is equal to the suffix sum of the rest of the array.
//Algo:
//1. Calculate the total sum of the array
//2. For each element a[i], calculate its prefix sum & suffix sum of the next element a[i+1] (total sum-suffix sum)
//if prefix sum of a[i] == suffix sum of a[i+1] then return true
//if whole array is traversed without statisfying the condition then return false

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
