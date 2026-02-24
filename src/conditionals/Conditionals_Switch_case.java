package conditionals;

public class Conditionals_Switch_case {
    public static void main(String[] args) {
        int a = 3;

        String s = switch (a) {
            case 1 -> "One";
            default -> "Default";
        };
        System.out.println(s);
    }
}
