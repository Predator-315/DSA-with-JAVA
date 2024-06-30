//Check whether an element exits in the array or not, if present then return the index of the element.
class LinearSearch 
{
    static boolean checkElementPresent(int a[],int i,int x)
    {
        //base case
        if(i==a.length)
        return false;
        //self-work
        if(x==a[i])
        return true;
        else
        //subproblem
        return checkElementPresent(a, i+1, x);
    }
    static int findElementIndex(int a[],int i,int x)
    {
        //base case
        if(i==a.length)
        return -1;
        //self-work
        if(x==a[i])
        return i;
        else
        //subproblem
        return findElementIndex(a, i+1, x);
    }
    public static void main(String[] args) 
    {
        int a[]={12,34,2,4,10};
        int x=4;
        if(checkElementPresent(a, 0, x))
        System.out.println("ELEMENT PRESENT AT INDEX "+findElementIndex(a, 0, x));
        else
        System.out.println("ELEMENT NOT PRESENT");
    }
}
//Time complexity: O(n)
//Space complexity: O(n)