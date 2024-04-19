package sorting;

import java.util.Arrays;

public class InsertionSort {

    // TC ->
    // Best case -> O(N)
    // Average and Worst => O(N^2)

    public static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int num = arr[i];
            int j = i-1; // pointer for shifting element
            while (j >= 0 && arr[j] > num) arr[j+1] = arr[j--]; // shifting element
            arr[j+1] = num;
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = new int[]{2,6,4,21,1,1,8,9,3};
        int[] sort = insertionSort(arr);
        System.out.println(Arrays.toString(sort));
    }

}
