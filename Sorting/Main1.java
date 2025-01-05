package Sorting;

import java.util.Arrays;

// bubble sort
public class Main1 {

    static int[] bubble(int[] nums)
    {
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length-1;j++)
            {
                if(nums[j]<nums[j-1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;

                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5};
        // System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));


    }
    
}
