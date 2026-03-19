package loops;

public class Loop_For {
    public static void main(String[] args) {
        int a = 0;

        // For-each loop:
        // For loop i < 5 iteration: 0
        // For loop i < 5 iteration: 1
        // For loop i < 5 iteration: 2
        // For loop i < 5 iteration: 3
        // For loop i < 5 iteration: 4
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + a);
            a++;
        }

        int[] array = new int[10];
        String[] strArray = new String[5];

        for (int number: array) {
            System.out.println("For-each loop number: " + number); // 0 0 0 0 0 0 0 0 0 0
        }

        for (String str: strArray) {
            System.out.println("For-each loop string: " + str); // null null null null null
        }

        // --------------- BREAK CONTINUE: ----------------
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop body when i is even
            }
            if (i > 7) {
                break; // Exit the loop when i is greater than 7
            }
            System.out.println("Continue loop iteration: " + i); // 1 3 5 7 9
        }
    }
}
