/*3. Merge Sort - Sort an Array of Book Prices
Problem Statement:
A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.
Hint:
Divide the array into two halves recursively.
Sort both halves individually.
Merge the sorted halves by comparing elements. */

import java.util.Scanner;

public class MergeSortBookPrices {
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] l= new int[n1];
        int[] r = new int[n2];

        for (int i = 0; i < n1; i++) l[i] = arr[left + i];
        for (int j = 0; j < n2; j++) r[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) {
                arr[k++] = l[i++];
            } else {
                arr[k++] = r[j++];
            }
        }

        while (i < n1) arr[k++] = l[i++];
        while (j < n2) arr[k++] = r[j++];
    }
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        mergeSort(prices, 0, n - 1);
        System.out.println("Sorted book prices in ascending order:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}
