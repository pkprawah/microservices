package java8;

import java.util.LinkedList;
import java.util.Queue;

public class Test17Demo {

   static Queue<Integer> queue1= new LinkedList<>();
    static  Queue<Integer> queue2= new LinkedList<>();
    int currentSize;


    public static void push(int num){
        queue2.add(num);

        while (!queue1.isEmpty()){
            queue2.add(queue1.peek());
            queue1.remove();
        }
        Queue<Integer> queue3=queue1;
        queue1=queue2;
        queue2=queue3;
    }

    public static void pop(){

        if(queue1.isEmpty()){
            System.out.println("underflow");
        }
        else{
            if(!queue1.isEmpty()) {
                System.out.println(queue1.peek());
                queue1.remove();

            }
        }
    }


    public static void main(String[] args) {

        push(1);
        push(2);
        push(3);
        push(4);

        pop();
        pop();
        pop();

        push(5);
        push(6);
        pop();
        pop();
        pop();





    }

}
