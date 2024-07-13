//Print all possible permutations of a given String.
//Sample Input: ABC
//Sample Output: ABC ACB BAC BCA CBA CAB

class StringPermutation
{
    static String replace(String str,int x,int y) 
    {
        char[] charArray = str.toCharArray();
        char temp=charArray[x];
        charArray[x]=charArray[y];
        charArray[y]=temp;
        return new String(charArray);
    }
    static void printPermutations(String s,int k)
    {
        //base case
        if(k==s.length()-1)
        {
            System.out.println(s);
            return;
        }
        //self-work+subproblem
        for(int i=k;i<s.length();i++)
        {
            printPermutations(replace(s, k, i), k+1);
        }
    }
    public static void main(String[] args) 
    {
        String s="ABC";
        printPermutations(s, 0);
    }
}
//Time complexity: O(fact(n))
//Space complexity: O(n)

//           abc               
//  abc      bac      cba      
//abc acb  bac bca  cba cab    