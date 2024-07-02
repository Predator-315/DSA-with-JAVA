//Check whether a given String is palindrome or not.
class ReverseString 
{
    //Apporach 1
    static String reverse(String s)
    {
        //base case
        if(s.length()==0)
        return "";
        //subproblem + self-work
        return reverse(s.substring(1))+s.charAt(0);
    }
    //Approach 2(in-place with pointers being passed)
    static boolean check(String s,int left,int right)
    {
        //base case
        if(left>=right)
        return true;
        //subproblem + self-work
        if(s.charAt(left)==s.charAt(right))
        return check(s, left+1, right-1);
        else
        return false;
    }

    //Approach 3(in-place without pointers being passed)
    static boolean check2(String s)
    {
        //base case
        if(s.length()<=1)
        return true;
        //subproblem + self-work
        if(s.charAt(0)==s.charAt(s.length()-1))
        return check2(s.substring(1, s.length()-1));
        else
        return false;
    }
    public static void main(String[] args) 
    {
        String s="MADAM";
        if(s.equals(reverse(s)))
        System.out.println("PALINDROME STRING");
        else
        System.out.println("NON-PALINDROME STRING");

        if(check(s,0,s.length()-1))
        System.out.println("PALINDROME STRING");
        else
        System.out.println("NON-PALINDROME STRING");
        
        if(check2(s))
        System.out.println("PALINDROME STRING");
        else
        System.out.println("NON-PALINDROME STRING");
    }
}
//Approach 1:
//Time complexity: O(n^2)
//Space complexity: O(n)

//Approach 2:
//Time complexity: O(n)
//Space complexity: O(n)

//Approach 3:
//Time complexity: O(n^2)
//Space complexity: O(n)