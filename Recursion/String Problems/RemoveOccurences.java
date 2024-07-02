//Remove all the occurences of a character from a given String.
class RemoveOccurences 
{
    //Approach 1
    static String remove(String s,char ch,int i)
    {
        //base case
        if(i==s.length())
        return "";
        //self-work + subproblem
        if(s.charAt(i)!=ch)
        return s.charAt(i)+remove(s, ch, i+1); //O(n)
        else
        return remove(s, ch, i+1);
    }
    //Approach 2
    static String remove2(String s,char ch)
    {
        //base case
        if(s.length()==0)
        return "";
        //self-work + subproblem
        if(s.charAt(0)!=ch)
        return s.charAt(0)+remove2(s.substring(1), ch); //O(n+n)~O(n)
        else
        return remove2(s.substring(1), ch);
    }
    public static void main(String[] args) 
    {
        String s="abcaxa";
        char ch='a';
        System.out.println("MODIFIED STRING= "+remove(s, ch,0));
        System.out.println("MODIFIED STRING= "+remove2(s, ch));
    }
}
//Concatanation of Strings, substring of a String takes linear-time(not constant time) i.e., O(n)
//Time complexity: O(n^2)
//Space complexity: O(n)