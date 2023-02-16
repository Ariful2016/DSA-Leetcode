package BitwiseOperator;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n ; i++) {
            System.out.println(i+" is prime "+checkPrime(i));
        }
    }

    private static boolean checkPrime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }

        return true;

    }
}
