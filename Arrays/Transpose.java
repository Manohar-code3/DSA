package Arrays;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int[][] tranarr=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                tranarr[i][j]=arr[j][i];
            }
        }
        System.out.println(Arrays.deepToString(tranarr));
    
        int[][] reverse=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                reverse[i][j]=tranarr[i][3-j-1];
            }
        }
        System.out.println(Arrays.deepToString(reverse));





    }
    
}
