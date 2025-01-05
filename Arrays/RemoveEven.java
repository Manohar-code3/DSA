package Arrays;

public class RemoveEven {
    public static int[] Reven(int[] arr)
    {
        int count=0;
        for (int i=0;i<arr.length;i++)
        {

            if(arr[i]%2!=0)
            {
                count++;
            }
        }
        int[] newarr=new int[count];
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2 != 0)
            {
                newarr[index]=arr[i];
            
                 index++;
            }
            
        }
        return newarr;

    }
    public static void printarray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +"  ");
        }
    }

    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6};
        int[] Result=Reven(x);
        printarray(Result);
        
        
    }

    
}
