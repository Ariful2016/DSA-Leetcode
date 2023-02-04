package loops;

public class BS_23_P_1 {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();


    }
}

class Counter{
    static int count = 0;
    public Counter(){
        count += 1;
        System.out.println(count+ " ");
    }
}
