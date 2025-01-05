package Arrays;

public class Reverse2 {

    public static void printarr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
    public static int[] reverseArr(int[] arr)
    {
        int[] newarr=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            newarr[i]=arr[arr.length-i-1];
        }
        return newarr;

    }
     

    public static void main(String[] args) {
        int[] manu={1,2,3,4,5,6};
        printarr(manu);
        int[] Result=reverseArr(manu);
        System.err.println();
        printarr(Result);

        
        
    }
    
}
