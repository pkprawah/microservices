package java8;

import java.util.Stack;

public class Test16 {

    public static void main(String[] args) {

        int top;

    }
}

class StackDemo{
    private static final int MAX=20;
    private int top;
    int stk[] = new int[MAX];

    StackDemo(){
        top=-1;
    }
    boolean isEmpty(){
        return top<0;
    }

    public void push(int num){

        if(top>=MAX){
            System.out.println("overflow");
        }
        else{
            stk[++top]=num;
        }
    }

    public int  pop(){
        int ele;
        if(top<0){
            System.out.println("underflow");
            return 0;
        }
        else{
            ele =stk[top--];
        }

        return ele;
    }
}
