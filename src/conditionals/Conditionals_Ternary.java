package conditionals;

public class Conditionals_Ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Ternary operator
        String result = (a > b) ? "a is greater than b" : "a is not greater than b";
        System.out.println(result);

        int age = 20;
        String info = age >= 18 ? "Adult" : "Teenager";
        System.out.println(info);
    }
}
