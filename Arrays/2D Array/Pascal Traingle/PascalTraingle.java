//Return first 'n' rows of a Pascal Traingle.
//Pascal Traingle is the traingle where each no is the sum of the two nos directly above it.
//Ex: n = 5
//Pascal Traingle:
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1

class PascalTraingle 
{
    static int[][] pascalTraingle(int n)
    {
        int a[][]=new int[n][]; //Jagged Array
        for(int i=0;i<n;i++)
        {
            a[i]=new int[i+1]; //declaring sub-array for each i
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                a[i][j]=1;
                else
                a[i][j]=a[i-1][j]+a[i-1][j-1];
            }
        }
        return a;
    }
    static void printTraingle(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int n=7;
        int result[][]=pascalTraingle(n);
        printTraingle(result);
    }
}