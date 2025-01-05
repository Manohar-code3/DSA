package Serching;
// binary search
public class Main4 {
    static int bs(int[] arr,int tar)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+ (end-start)/2;
            if(arr[mid]>tar)
            {
                end=mid-1;

            }
            else if(arr[mid]<tar)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6,7,8,9};
        int tar=8;

        int ans=bs(arr,tar);
        System.out.println(ans);
        
    }
    
}
