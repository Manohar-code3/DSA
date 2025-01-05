package Sorting;
import java.util.Arrays;

public class Main4 {
    // merge sort in resursion method

    static int[] mergesort(int[] arr)
    {
        if(arr.length==1) return arr;

        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);


    }
    static int[] merge(int[] first,int[] last) 
    {
        int[] mix=new int[first.length+last.length];
        
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<last.length)
        {
            if(first[i]<last[j])
            {
                mix[k]=first[i];
                i++;
                k++;
            }
            else{
                mix[k]=last[j];
                j++;
                k++;
            }
        }
        while (i<first.length) {
            mix[k]=first[i];
                i++;
                k++;
            
        }
        while (j<last.length) {
            mix[k]=last[j];
            j++;
            k++;

            
        }
        return mix;
    }
    public static void main(String[] args) {
        int[] arr={4,5,2,7,9,1};
        System.out.println(Arrays.toString(arr));
        int [] ans=mergesort(arr);
        System.out.println(Arrays.toString(ans));

    }
}
