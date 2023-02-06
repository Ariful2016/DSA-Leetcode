package Algorithms.SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        boolean sorted;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            // check already sorted
            sorted = false;
            // for each step, last index will be hold max element
            for (int j = 1; j < arr.length - i ; j++) {
                if (arr[j] < arr[j - 1]){
                    // swap value item
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    sorted = true;
                }
            }
            // if did not swap a particular value of i
            if (!sorted){
                break;
            }
        }
    }
}
