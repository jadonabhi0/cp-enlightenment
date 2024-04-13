package BinarySearch;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4 ,5, 6, 7, 8, 9};
        System.out.println(binarySearchIterative(arr, 4));
        System.out.println(binarySearchRecursive(arr, 4, 0, arr.length));
    }

    public static boolean binarySearchIterative(int[] arr, int tar){
        int low = 0;
        int hi = arr.length;
        while(low <= hi){
            int mid  = (low + hi)/2;
            if(arr[mid] == tar){
                return true;
            }
            else if (arr[mid] < tar){
                low = mid+1;
            }else {
                hi = mid - 1;
            }
        }
        return false;
    }

    public static boolean binarySearchRecursive(int[] arr, int tar, int lo, int hi){
       if (lo <= hi){
           int mid = (lo + hi)/2;
           if(arr[mid] == tar){
               return true;
           } else if (arr[mid] < tar) {
               return binarySearchRecursive(arr, tar, mid+1, hi);
           }else {
              return binarySearchRecursive(arr, tar, lo, mid - 1);
           }
       }
       return false;
    }

}
