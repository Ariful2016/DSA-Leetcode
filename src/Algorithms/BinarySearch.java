package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {-32,-13,-7,12,34,56,78,99,123,234};
        int [] arr2 = {234,123,99,78,56,34,12,-7,-13,-32};
        int target = 123;
        //int ans = FindTargetValue(arr, target);
        //System.out.println(ans);

        int ans = orderAgnosticBS(arr2, target);
        System.out.println(ans);
    }

    static int FindTargetValue(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while ( start <= end){
            int middle = start + (end - start) /2;
            if ( target > arr[middle]){
                start = middle + 1;
            }else if (target < arr[middle]){
                end = middle -1;
            }else {
                return middle;
            }
        }
        return -1;
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while ( start <= end){
            int middle = start + (end - start) /2;
            if ( arr[middle] == target){
                return middle;
            }
            if (isAsc){
                if ( target > arr[middle]){
                    start = middle + 1;
                }else{
                    end = middle -1;
                }
            }else {
                if ( target < arr[middle]){
                    start = middle + 1;
                }else{
                    end = middle -1;
                }
            }

        }
        return -1;
    }
}
