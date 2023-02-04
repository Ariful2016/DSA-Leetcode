package Leetcode;

public class RotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {4,6,8,0,1,2,3};
        int target = 6;
        System.out.println(search(arr,target));

    }

    static int search(int[] nums, int target) {

        int pivot = findPivot(nums);
        // if we don't find pivot
        if (pivot == -1){
            return FindTargetValue(nums, target, 0, nums.length -1);
        }
        // if pivot found
        if(nums[pivot] == target){
            return pivot;
        }

        if (target >= nums[0]){
            return FindTargetValue(nums,target,0, pivot - 1);
        }
        return FindTargetValue(nums, target, pivot+1, nums.length -1);

    }

    static int FindTargetValue(int[] arr, int target, int start, int end){
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
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){}{
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){
                return mid -1;
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
