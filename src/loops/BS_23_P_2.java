package loops;

public class BS_23_P_2 {
    public static void main(String[] args) {
        int a = 2, b = 10, c=0;
        for (int i = 1; i<=b; i++){
            if (a> 0 && a <= 3){
                c = b >> a;
            }
            ++a;
            if(a > 2) a -= i;
            else {
                b += (c - i);
            }
            b--;
        }

        System.out.println("%d, %d, %d\n"+ a + " " +b + " "+ c/a);
    }
}
