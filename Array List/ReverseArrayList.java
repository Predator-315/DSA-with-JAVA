import java.util.ArrayList;
// import java.util.Collections;

class ReverseArrayList 
{
    static void reverse(ArrayList<Integer> list)
    {
        int start=0,end=list.size()-1;
        while(start<end)
        {
            Integer temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
    }
    public static void main(String[] args) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(15);
        list.add(20);
        System.out.println("ORIGINAL LIST: ");
        System.out.println(list);
        reverse(list);
        System.out.println("REVERSED LIST: ");
        System.out.println(list);

        //reversing using Collections class
        // Collections.reverse(list);
        // System.out.println(list);
    }    
}