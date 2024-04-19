package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        int n =  arr.length;
        boolean swap = false;
        for(int i = 0 ; i < n-1; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{2,6,4,21,1,1,8,9,3};
        int[] sort = bubbleSort(arr);
        System.out.println(Arrays.toString(sort));
    }


}
