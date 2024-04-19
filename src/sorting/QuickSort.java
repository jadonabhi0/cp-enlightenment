package sorting;

import java.util.Arrays;

public class QuickSort {

    // Quick sort is unstable and partition based sorting algo.
    // TC => Best, Worst and Average is O(n*log(n))

    // a utility function to swap two elements of an array
    public void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    // first element is always considered as pivot of the partition
    // last pointer keeps on increasing until arr[pointer] >= pivot
    // right pointer keeps on decreasing until arr[pointer] <= pivot
    // if left pointer >= right pointer swap left pointer with pivot, else swap pointers

    // function to generate partitions
    public int partition(int[] array, int lo, int hi){

        int pivot = array[lo];
        int pivIdx = lo;
        lo = lo+1;

        while (lo <= hi){
            while (lo < array.length &&  array[lo] < pivot) lo++;
            while (hi > 0 && array[hi] > pivot) hi--;
            if (hi <= lo) {
                swap(array, hi, pivIdx);
                return hi;
            }
            else swap(array, lo, hi);
        }

       return hi;
    }


    public void quickSort(int[] array, int lo, int hi){

        // base case
        if (hi <= lo) return;

        int partionIdx = partition(array, lo, hi);
        quickSort(array, lo, partionIdx - 1);
        quickSort(array, partionIdx + 1, hi);

    }



    public static void main(String[] args) {
        int [] arr = new int[]{35, 15, 20, 10, 43, 21, 78, 9, 3, 2, 8, 0, 65};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

}
