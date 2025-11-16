/*Sort a Stack Using Recursion
Problem: Given a stack, sort its elements in ascending order using recursion.
Hint: Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position. */

import java.util.Stack;

public class SortStackUsingRecursion {
    static void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int top = st.pop();
        sortStack(st);
        insertInSortedOrder(st, top);
    }
    static void insertInSortedOrder(Stack<Integer> st, int element) {
        if (st.isEmpty() || st.peek() <= element) {
            st.push(element);
            return;
        }
        int top = st.pop();
        insertInSortedOrder(st, element);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);
        sortStack(st);
        System.out.println("Sorted Stack: " + st);
    }
}
