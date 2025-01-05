package Serching;
// linear search
import java.util.Arrays;

public class Main3 {

    static int[] ls(int[][] arr, int tar)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==tar) return new int[]{i,j};
            
            }
        }
        return new int[]{-1,-1};
    }
    static int maxelm(int[][] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int[] i:arr)
        {
            for(int j :i)
            {
                if(j>max)
                {
                    max=j;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}

        };
        int tar=9;
        int [] ans=ls(arr, tar);
        int ans2=maxelm(arr);

        // int[] arr2=Arrays.toString(arr);
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(ans));
        System.out.println("max element " + ans2);
    }
    
}
