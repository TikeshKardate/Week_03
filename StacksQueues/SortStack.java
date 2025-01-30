/*Sort a Stack Using Recursion
Problem: Given a stack, sort its elements in ascending order using recursion.
Hint: Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position.
 */

import java.util.Stack;
public class SortStack{
  
    public static void insert(Stack<Integer>stack,int temp){
        if(stack.empty() || stack.peek()<=temp){
            stack.push(temp);
            return;
        }
        else{
            int t=stack.peek();
            stack.pop();
            insert(stack,temp);
            stack.push(t);
        }
    }
    public static void sortStack(Stack<Integer>stack){
        if(!stack.empty()){
            int temp=stack.pop();
            sortStack(stack);
            insert(stack,temp);
        }
    }
   
   public static void main(String[] args) {
    Stack<Integer>stack=new Stack<>();
    stack.push(30);
    stack.push(-5);
    stack.push(18);
    stack.push(14);
    stack.push(-3);
    stack.push(2);

    System.out.println("Stack before sorting");
    System.out.println(stack);
    sortStack(stack);

    System.out.println();

    System.out.println("Stack after sorting");
    System.out.println(stack);
   }



}