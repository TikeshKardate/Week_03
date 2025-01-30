/*
Implement a Queue Using Stacks
Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.
 */

import java.util.Stack;
class ImplementQueue{
    Stack<Integer>stack1=new Stack<>();
    Stack<Integer>stack2=new Stack<>();
    public void enqueue(int data){
        stack1.push(data);
    }
    public int dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public int peek(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
}

public class QueueImplementation{
    public static void main(String[] args){
        ImplementQueue queue=new ImplementQueue();
       System.out.println("56 is enqueued");
        queue.enqueue(56);
        System.out.println("27 is enqueued");
        queue.enqueue(27);
        System.out.println("32 is enqueued");
        queue.enqueue(32);
        System.out.println("45 is enqueued");
        queue.enqueue(45);
        System.out.println();
        
        System.out.println("Dequeued element is "+queue.dequeue());
        System.out.println("Peeked element is "+queue.peek());
        System.out.println("Dequeued element is "+queue.dequeue());
        System.out.println("Peeked element is "+queue.peek());
        System.out.println("Dequeued element is "+queue.dequeue());
        System.out.println("Peeked element is "+queue.peek());
        System.out.println("Dequeued element is "+queue.dequeue());
       
       

    }
    
}