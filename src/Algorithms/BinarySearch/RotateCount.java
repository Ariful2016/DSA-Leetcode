package Algorithms.BinarySearch;

public class RotateCount {
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,2,3};
        System.out.println(search(arr));
    }

    static int search(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
    }
// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (end > mid && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (start < mid && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if (arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
