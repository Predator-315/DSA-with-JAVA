//Find the unique element in the array where all the elements are repeated twice except the unique element being once.
//Algo:
//1. Traverse all pairs
//2. Equal pairs= -1
//3. Traverse the array again & return the element>0
class UniqueElement 
{
    static int findUniqueElement(int a[])
    {
        int i,j,element=-1;
        for(i=0;i<a.length;i++)
        {

            for(j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    a[i]=-1;
                    a[j]=-1;
                }
            }
        }
        for(i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                element=a[i];
                break;
            }
        }
        return element;
    }
    public static void main(String[] args) 
    {
        int a[]={1,2,3,4,2,1,3};
        System.out.println("UNIQUE ELEMENT= "+findUniqueElement(a));
    }
}
