package loops;

public class Loop_While {
    public static void main(String[] args) {
        int a = 0;

        // While loop:
        // While a < 5 iteration: 0
        // While a < 5 iteration: 1
        // While a < 5 iteration: 2
        // While a < 5 iteration: 3
        // While a < 5 iteration: 4
        while (a < 5) {
            System.out.println("While loop iteration: " + a);
            a++;
        }

        // WHILE TRUE => Infinite loop.

    }
}
