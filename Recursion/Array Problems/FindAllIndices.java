import java.util.ArrayList;

class FindAllIndices 
{
    static ArrayList<Integer> findIndices(int a[],int i,int x)
    {
        //base case
        if(i==a.length)
        return new ArrayList<Integer>(); //return empty list if end is reached

        //self-work
        ArrayList<Integer> ans=new ArrayList<>();
        if(a[i]==x)
        ans.add(i); //add index to the list
        //subproblem
        ans.addAll(findIndices(a, i+1, x)); //add all the elements of the list returned from subproblem
        return ans;
    }
    public static void main(String[] args) 
    {
        int a[]={12,3,34,2,3,3,4};
        int x=3;
        System.out.println(findIndices(a, 0, x));
    }
}