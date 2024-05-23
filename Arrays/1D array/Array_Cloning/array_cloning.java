import java.util.Arrays;

class array_cloning
{
    static void print_array(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        } 
    }
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,5,6};

        // int b[]=a; //shallow copy of a(both b & a points to the same memory location)
        //any changes made to a will reflect b & vise-versa.

        // int b[]=a.clone(); //deep copy of a(allocates separate memory & b points to it)
        //any changes made to a won't relfect b & vise-versa.

        // int b[]=Arrays.copyOf(a,3);//creates a deep copy of length 3(0 to 3th position)

        int b[]=Arrays.copyOfRange(a,2,5); //creates a deep copy of range from 2th position(inclusive) to 5th position(exclusive)

        print_array(b);
    }
}