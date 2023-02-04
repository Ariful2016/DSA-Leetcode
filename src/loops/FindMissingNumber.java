package loops;

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] n = {1,2,3,4,5,6,8,9,10};

        System.out.println(missingNumber(n));

    }
    static int missingNumber(int [] n){
        int start = 1;
        int end = 10;
        int ans = 0;
        for(int i =0; i<n.length-1; i++){
            if (n[0] != 1){
               return 1;
            }else if (n[i+1] - n[i] == 2){
                ans = n[i]+1;
                return ans;
            }
        }
        return n[n.length-1]+1;
    }
}
