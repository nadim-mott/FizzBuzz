public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int n = 100;
        while (n > 0) {
            count ++;
            n = reduce_func(n);
        }
        System.out.println(count);
    }
    public static int reduce_func(int n) {
        if (n % 2 == 0) {
            return (int) n / 2;
        } else {
            return n - 1;
        }
    }
}
