/*Implement a Queue Using Stacks
Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.
Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed. */

import java.util.Stack;

class MyQueue{
    Stack<Integer> st=new Stack<>();
    Stack<Integer> temp=new Stack<>();
    public void enqueue(int data){
        if(st.size()==0){
            st.push(data);
        }else{
            while(st.size()!=0){
                temp.push(st.pop());
            }
            st.push(data);
            while(temp.size()!=0){
                st.push(temp.pop());
            }
        }
    }
    public int dequeue(){
        int a=st.pop();
        return a;
    }

}
public class QueueUsingStacks{
    public static void main(String[] args) {
        MyQueue q=new MyQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}