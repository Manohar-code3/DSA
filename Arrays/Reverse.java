package Arrays;

public class Reverse {
    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        int n=arr.length;
        for(int i: arr)
        {
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("reverse order");
        int[] rev=new int[n];
        for(int i=0;i<n;i++)
        {
            rev[i]=arr[n-i-1];
        }
        for(int i : rev)
        {
            System.out.print(i+" ");
        }
        
    }
    
    
}
