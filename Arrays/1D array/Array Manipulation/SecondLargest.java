//Find the Second Largest
//Algo
//1. Find maximum
//2. Make all maximum occurences= -infinity
//3. second maximum= Find maximum again
class SecondLargest 
{
    static int findMax(int a[])
    {
        int i,max;
        max=Integer.MIN_VALUE;
        for(i=0;i<a.length;i++)
        {
            if(max<a[i])
            max=a[i];
        }
        return max;
    }
    static int findSecondMax(int a[])
    {
        int i,max,second_max;
        max=findMax(a);
        for(i=0;i<a.length;i++)
        {
            if(max==a[i])
            a[i]=Integer.MIN_VALUE;
        }
        second_max=findMax(a);
        return second_max;
    }
    public static void main(String[] args) 
    {
        int a[]={5,4,1,6,2};
        System.out.println("SECOND LARGEST= "+findSecondMax(a));
    }
}
