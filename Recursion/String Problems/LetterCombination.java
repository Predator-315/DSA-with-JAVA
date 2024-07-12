//Given a String containing digits from 2-9 inclusive where each digit can represent following characters:
//2:[a,b,c], 3:[d,e,f], 4:[g,h,i], 5:[j,k,l], 6:[m,n,o], 7:[p,q,r,s], 8:[t,u,v], 9:[w,x,y,z].
//Return all possible letter combinations that the number could represent. Return the answer in any order.
//Sample Input: "23"
//Sample Output: "ad","ae","af","bd","be","bf","cd","ce","cf"

class LetterCombination 
{
    static void printCombination(String s,String keypad[],String sub)
    {
        //base case
        if(s.length()==0)
        {
            System.out.println(sub);
            return;
        }
        //self-work + subproblem
        int d=s.charAt(0)-'0';
        String choices=keypad[d];
        for(int i=0;i<choices.length();i++)
        {
            printCombination(s.substring(1),keypad, sub+choices.charAt(i));
        }
    }
    public static void main(String[] args) 
    {
        String s="257";
        String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        printCombination(s, keypad,"");
    }
}
//Time complexity: O(n*4^n)
//Space complexity: O(n)