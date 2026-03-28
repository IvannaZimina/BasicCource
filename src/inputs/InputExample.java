package inputs;
import java.util.Scanner;

import objects.Person;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        Person person2 = new Person(name);
        person2.printNameAndSecodName(name, "Smith");

        scanner.close();
    }
}
