public class Multiples {
    public static void main(String[] args) {

        //for (int i = 1; i < 100; i++) {
        int i = 1;
        int count = 0;
        while (i < 1000) {
            if (isMulitiple(i)) {count++;}
            i++;
        }
        System.out.println(count);
    }

    public static boolean isMulitiple(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        return (divisibleBy3 || divisibleBy5);
    }
}

