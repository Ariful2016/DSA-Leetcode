package Algorithms;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindEvenDigit {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums){
            if (checkEvenDigit(i)){
                count++;
            }
        }
        return  count;
    }

    static boolean checkEvenDigit(int i) {
        int even = Digit2(i);
        /*if ( even % 2 == 0){
            return true;
        }*/
        return even % 2 == 0;
    }
    // optimize
    static int Digit2(int n){
        return (int) (Math.log10(n) + 1);
    }

    static int Digit(int n){
        int count = 0;
        if (n == 0) return 1;
        if (n < 0) {
            n = n * -1;
        }
        while (n > 0){
            count++;
            n = n/10;
        }
        return count;
    }
}
