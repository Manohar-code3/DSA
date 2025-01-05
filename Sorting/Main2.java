package Sorting;
// selection sort

import java.util.Arrays;

public class Main2 {
    static int maxelement(int[] nums,int start,int end)
    {
        int max=start;
        for (int i = 0; i <=end; i++) {
            if(nums[max]<nums[i])
            {
                max=i;
            }
            
        }
        return max;

    }
    static void swap(int[] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    static void selection(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            int start=0;
            int last=nums.length-i-1;
            int max=maxelement(nums, start, last);
            swap(nums,last, max);

        }
    
    }
    public static void main(String[] args) {
        int[] nums={5,3,4,2,1};

        selection(nums);
        System.out.println(Arrays.toString(nums));

    }
    
}
