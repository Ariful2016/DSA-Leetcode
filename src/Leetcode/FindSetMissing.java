package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/set-mismatch/
public class FindSetMissing {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findSetMissing(arr)));
    }
    static int[] findSetMissing(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            // sorting
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        // find missing
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j +1){
                return new int[]{arr[j], j+1};
            }
        }
        return new int[]{-1, -1};
    }
    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
