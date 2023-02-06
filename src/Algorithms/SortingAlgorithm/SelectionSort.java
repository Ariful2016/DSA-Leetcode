package Algorithms.SortingAlgorithm;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,-3,1,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max element then swap it the correct index
            int last = arr.length - i - 1;
            int maxIndex = findMax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[max] < arr[i]){
              max = i;
            }
        }
        return max;
    }
}
