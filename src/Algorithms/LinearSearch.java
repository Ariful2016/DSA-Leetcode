package Algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int [][] arr = {
                {12,34,43},
                {-45,67,21,17},
                {65,32,99}};

        System.out.println(maxValue(arr));

    }

    static int maxValue(int [][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] m: arr) {
            for (int i : m){
                if ( i > max){
                    max = i;
                }
            }
        }
        return max;
    }

}
