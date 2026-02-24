package variables;

public class Variables {
    // enter point of the program
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        // variables and data types
        // integers numbers - целочисленные числа
        byte a = 100;
        short b = 20000;
        int c = 1000000;
        long d = 100000000;

        // floating-point numbers - числа с плавающей запятой
        float e = 10.22f; // явно указаваем 'f' для обозначения типа float для компилятора
        double f = 10.4573738348343;

        // logical values - логические значения
        boolean g = true;
        boolean h = false;

        // символы в Java заключаются в одинарные кавычки
        char i = 'i';

        System.out.println(100);
        System.out.println(a);
        System.out.println(i);

        // reference data type - ссылочные типы данных
        String name = "Andrei";
        String name1 = "Andrei";

        // создаем явный новый объект String, который содержит "Andrei"
        String name2 = new String("Andrei");

        // true, так как name и name1 ссылаются на один и тот же объект в памяти
        System.out.println("name == name1: " + (name == name1)); 

        // false, так как name и name2 ссылаются на разные объекты в памяти
        System.out.println("name == name2: " + (name == name2)); 

        String welcome = "Hello world!";
        System.out.println(welcome);
    }
}
