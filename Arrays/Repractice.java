package Arrays;

import java.util.Scanner;

public class Repractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n;
        System.out.println("enter the n");
        n=input.nextInt();
        int[] manu=new int[n];
        System.out.println("enter the elemts");
        for(int i=0;i<n;i++)
        {
            manu[i]=input.nextInt();
        }
        System.out.println("array elemnts....");
        for(int i=0;i<n;i++)
        {
            System.out.print(manu[i]+" ");
        }
        input.close();;
    }
    
}
