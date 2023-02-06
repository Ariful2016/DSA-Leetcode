package Algorithms.BinarySearch;

import java.util.Arrays;

public class SortedMatrixArray {
    public static void main(String[] args) {

        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        System.out.println(Arrays.toString(findNumber(arr,37)));


    }
    static int[] findNumber(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;
        while (r < arr.length && c >= 0){
            if (arr[r][c] == target){
                return new int[]{r,c};
            }
            if (arr[r][c] > target){
                c--;
            }else {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
