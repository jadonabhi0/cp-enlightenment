package sorting;

import java.util.Arrays;

public class SelectionSort {

    // TC ->
    // Best, Worst and Average is O(n^2)

    public static int[] selectionSort(int[] array){

        for(int i = 0 ; i < array.length ; i++){
            int min = Integer.MAX_VALUE;
            for(int j = i+1 ; j < array.length ; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {

        int [] arr = new int[]{3,5,1,2,9,6,4,7,3};
        int[] sort = selectionSort(arr);
        System.out.println(Arrays.toString(sort));

    }

}
