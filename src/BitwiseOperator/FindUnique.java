package BitwiseOperator;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(unique(arr));
    }

    static int unique(int[] arr) {
        int i = 0;
        for (int n : arr){
            i ^= n;
        }
        return i;
    }
}
