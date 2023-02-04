package loops;

public class BS_23_P_3 {
    public static void main(String[] args) {
        int i;
        int n = 12;
        for (i = 0; i< n/2; i++){
            if(i<=5){
                i++;
            }else {
                break;
            }
        }
        System.out.println(i);
    }
}
