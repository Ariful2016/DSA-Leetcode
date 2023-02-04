package Leetcode;

public class FindNumberFromInfiniteArray {
    public static void main(String[] args) {

        int[] arr ={2,3,4,5,6,7,8,9,10};
        int target = 7;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]){
           int newStart = end + 1;
           end = end + (end - start +1) * 2;
           start = newStart;
        }
        return FindTargetValue(arr,target,start,end);
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
}
