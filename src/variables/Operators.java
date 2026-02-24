package variables;

public class Operators {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("a: " + a); // Output: 1
        System.out.println("b: " + b); // Output: 2

        System.out.println("Sum: a+b " + (a + b));        // Addition: 3
        System.out.println("Difference: a-b =" + (a - b)); // Subtraction: -1
        System.out.println("Product: a*b =" + (a * b));    // Multiplication: 2
        System.out.println("Quotient: a/b =" + (a / b));   // Division: 0.5
        System.out.println("Remainder: a%b =" + (a % b));  // Modulus: 1
        
        System.out.println("a++: " + (a++));           // Increment: 2
        System.out.println("a--: " + (a--));           // Decrement: 1

        System.out.println("a +=2: " + (a +=2));     // Addition assignment: 3
        System.out.println("a -= 1: " + (a -= 1));   // Subtraction assignment: 2
        System.out.println("a *= 2: " + (a *= 2));   // Multiplication assignment: 4
        
        System.out.println("a == b: " + (a == b)); // Equal to: false
        System.out.println("a != b: " + (a != b)); // Not equal to: true
        System.out.println("a > b: " + (a > b));   // Greater than: false
        System.out.println("a < b: " + (a < b));   // Less than: true
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to: false
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to: true

        double c = (double) a / b; // Type casting to double for accurate division
        System.out.println(c); // Output: 0.5

        System.out.println("a == b && b == c: " + (a == b && b == c)); // Logical AND
        System.out.println("a == b || b == c: " + (a == c || b == c)); // Logical OR
        //System.out.println("!a: " + !a);     // Logical NOT


    }
}
