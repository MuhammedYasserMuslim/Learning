package comspring;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

       // Stack<String>stack=new Stack<String>();
        Stack stack = new Stack();
        stack.push("Ali");
        stack.push("Muhammed");
        stack.push("Salah");
        stack.push("Yasser");
        stack.push("Hassan");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.peek());
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("Ali");
        queue.add("Basel");
        queue.add("Khalid");
        queue.add("Muhammed");
        queue.add("Yasser");
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);

    }
}