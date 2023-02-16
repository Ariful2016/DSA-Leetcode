package BitwiseOperator;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(checkOddEven(44));
    }

    static boolean checkOddEven(int n){
        if ((n & 1) == 1) return true; // for odd
        //if ((n & 1) != 1) return true; // for even
        return false;
    }
}
