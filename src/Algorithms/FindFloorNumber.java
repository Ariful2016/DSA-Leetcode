package Algorithms;

public class FindFloorNumber {
    public static void main(String[] args) {

        int [] arr = {-32,-13,-7,12,34,56,78,99,123,234};
        int target = 50;
        int ans = FloorNumber(arr, target);
        System.out.println(ans);


    }

    static int FloorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) return -1;
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
        return end;
    }

}
