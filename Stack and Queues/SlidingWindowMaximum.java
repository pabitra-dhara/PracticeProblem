/*Sliding Window Maximum
Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
Hint: Use a deque (double-ended queue) to maintain indices of useful elements in each window. */


import java.util.Scanner;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int[] res = new int[nums.length - k + 1];
        int i = 0;
        while(i + k - 1 < nums.length){
            int tmp=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                tmp=Math.max(tmp, nums[j]);
            }
            res[i]=tmp;
            i++;
        }
        for(int val:res){
            System.out.print(val+" ");
        }
    }
}
