package Stack;


public class code1 {
    static final int n=5;
    static int[] stc=new int[5];
    static int top=-1;
    static void push(int x)
    {
        if(top == n-1)
        {
            System.out.println("stack overflow");
        }
        else{
            stc[++top]=x;
        }

    }
    static void pop()
    {
        if(top == -1)
        {
            System.out.println("stack uderflow");
        }
        else{
            top--;
        }

    }
    static void display()
    {
        for(int i=top; i>=0; i--)
        {
            System.out.print(" ->"+stc[i]);

        }
        System.err.println();
       
    
    }
    

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        display();
        pop();
        display();
        
    }
    
}
