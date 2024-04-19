package sorting;

import java.util.Arrays;

public class MergeSort {

    // Merge sort is also known as unstable sort because it rearranges the natural ordering of elements in an array

    // TC best, worst and average
    // => O(n*log(n))

    public static int[] divide(int [] array, int lo, int hi){

        // handle base case
        if (lo == hi){
            return new int[]{array[lo]};
        }

        int mid = (lo + hi)/2;

        // perform divide and conquer
        int[] left = divide(array, lo, mid);
        int[] right = divide(array, mid + 1, hi);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {

        int n = left.length;
        int m = right.length;

        // stores sorted elements
        int [] array = new int[n+m];

        int i = 0;
        int j = 0;
        int c = 0;

        while(i < n && j < m){
            if (left[i] < right[j]) array[c++] = left[i++];
            else array[c++] = right[j++];
        }

        // shifting the remaining elements to
        while (i < n) array[c++] = left[i++];
        while(j < m) array[c++] = right[j++];

        return array;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{5,3,1,7,8,9,4,3,2,6,7, 5, -1, 3, 9, 5};
        int[] sortedArray = divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sortedArray));

    }
}
