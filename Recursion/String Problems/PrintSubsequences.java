//Print all subsequences of a String(in any order).
//Sample Input: "abc" 
//Sample output: "abc","ab","ac","a","bc","b","c",""

class PrintSubsequences 
{
    static void printSubsequences(String s,String subseq)
    {
        //base case
        if(s.length()==0)
        {
            System.out.println(subseq);
            return;
        }
        //subproblem + self-work
        printSubsequences(s.substring(1),subseq+s.charAt(0));
        printSubsequences(s.substring(1),subseq);
    }
    public static void main(String[] args) 
    {
        String s="abc";
        printSubsequences(s, "");
    }
}
//Time complexity: O(2^n*n)
//Space complexity: O(n)

//            abc
//      a             ""   
//  ab      a      b     ""  
//abc ab  ac a   bc b   c  ""