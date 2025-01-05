package Arrays;
import java.util.*;
// import java.io.*;

class Minmax
{
    public static void main(String args[])
    {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the size of array");
        n=input.nextInt();

        int[] arr=new int[n];

        System.out.println("enter the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        // Arrays.sort(arr);
        // Minmax m= new Minmax();
        // m.sort(arr);
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // System.out.println("max value : "+arr[n-1]);
        // System.out.println("min value : "+arr[0]);
        input.close();




    }
    
    public void sort(int a[])
    {
        int m=a.length;
        for(int i=0;i<m-1;i++)
        {
            int Imin=i;
            for(int j=i+1;j<m;j++)
            {
                if (a[j]<a[Imin])
                {
                    Imin=j;
                }
            }
            int temp=a[Imin];
            a[Imin]=a[i];
            a[i]=temp;
        }
        
    }

}
