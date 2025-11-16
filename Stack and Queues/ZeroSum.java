/*Find All Subarrays with Zero Sum
Problem: Given an array, find all subarrays whose elements sum up to zero.
Hint: Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists. */


public class ZeroSum {

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, -4, -2, 2};
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                if (sum == 0) {
                    System.out.println("Subarray: " + start + " to " + end);
                }
            }
        }
    }
}
