package Serching;
// linear search
public class Main1 {

    static int ls(int[] arr ,int tar)
    {
        if(arr.length<0) return -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==tar) return i;
            
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int[] arr={81,44,143,1,2,3};
        int tar=44;
        int ans=ls(arr, tar);
        System.out.println(ans);
        
    }
    
}
