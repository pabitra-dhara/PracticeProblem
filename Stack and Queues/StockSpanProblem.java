/*Stock Span Problem
Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than or equal to the current day's price).
Hint: Use a stack to keep track of indices of prices in descending order. */

import java.util.*;

public class StockSpanProblem {

    public static int[] stockSpan(int[] price) {
        Stack<Integer> st = new Stack<>();
        int n = price.length;
        int[] span = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int[] ans = stockSpan(price);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
            if (i < ans.length - 1)
                System.out.print(", ");
        }
    }
}

