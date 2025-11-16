/*Check for a Pair with Given Sum in an Array
Problem: Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.
Hint: Store visited numbers in a hash map and check if target - current_number exists in the map. */

import java.util.*;

public class PairwithGivenSumArray {

    public static boolean hasPair(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int need = target - num;
            if (set.contains(need)) {
                System.out.println("Pair: " + num + ", " + need);
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        if (!hasPair(arr, target)) {
            System.out.println("No pair found");
        }
    }
}
