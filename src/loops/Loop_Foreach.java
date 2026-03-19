package loops;

public class Loop_Foreach {
    public static void main(String[] args) {
        // for (типа переменная : коллекция) { ... }

        // For-each loop:
        // Fruit: Apple
        // Fruit: Banana
        // Fruit: Cherry
        String[] fruits = { "Apple", "Banana", "Cherry" };
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Array element: 0
        // Array element: 0
        // Array element: 0
        // Array element: 0
        // Array element: 0
        int[] array = new int[5];
        for (int number : array) {
            System.out.println("Array element: " + number);
        }
    }
}
