package Serching;
// linear search
public class Main2 {

    static int ls(String str,char c)
    {
        if(str.length()<0) return -1;
        for(int i=0;i<str.length();i++)
        {
            if(c==str.charAt(i)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str="manohr";
        char c='h';
        int ans=ls(str, c);
        System.out.println(ans);
    }
}

    

