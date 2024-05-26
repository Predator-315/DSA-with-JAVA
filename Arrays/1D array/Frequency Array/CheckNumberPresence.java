//Repeatedly input numbers & Check the presence of the number in the given array
//Given Hint: All the elements are less than 10^5
//Algo:
//1. Make a frequency Array of size 10^5 containing zeros intially
//2. Increment the a[i]th position elements by 1 in the frequency array
//3. Input Number & check its presence by checking freq[num] > 0
//4. Number is present if freq[num] > 0

import java.util.Scanner;
class CheckNumberPresence
{
    static int[] makeFrequencyArray(int a[])
    {
        int freq[]=new int[100000];
        int i;
        for(i=0;i<a.length;i++)
        {
            freq[a[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int a[]={1,3,4,3,2,500,69};
        int freq[]=makeFrequencyArray(a);
        while(true)
        {
            System.out.println("ENTER A NUMBER ELSE ENTER -1 TO EXIT THE PROCESS");
            int num=in.nextInt();
            if(num==-1)
            break;
            else
            {
                if(freq[num]>0)
                System.out.println("NUMBER PRESENT");
                else
                System.out.println("NUMBER NOT PRESENT");
            }
        }
        in.close();
    }
}