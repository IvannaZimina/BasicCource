package conditionals;

public class Conditionals_If_Else {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;


        // Logical AND (&&)
        if (a > 5 && b > 15) {
            System.out.println("Both conditions are true.");
        }

        // Logical OR (||)
        if (a > 15 || b > 15) {
            System.out.println("At least one condition is true.");
        }

        // Logical NOT (!)
        if (!(a > 15)) {
            System.out.println("Condition is false, so logical NOT is true.");
        }

        int example = 16;

        if (example < 5) {
            example += 10;
            System.out.println("Block if executed.");
        } else if (example == 15) {
            example -= 10;
            System.out.println("Block else if executed.");
        } else {
            System.out.println("Block else executed.");
        }

    }
}
