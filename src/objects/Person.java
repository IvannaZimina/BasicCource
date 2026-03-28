package objects;

public class Person {
    private String name;
    
    // модификаторДоступа final тип NAME - переменная, которая не может быть изменена после инициализации (константа)
    public final double PI;

    // модификаторДоступа static типа NAME - переменная, которая принадлежит классу, а не экземпляру класса
    public static int COUNT = 0;

    public Person(String name) {
        // this - указывает, что переменная принадлежит текущему экземпляру класса
        this.name = name;
        PI = 3.14;
        COUNT++; // Увеличиваем счетчик при создании нового экземпляра класса
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printNameAndSecodName(String name, String secondName) {
        System.out.println("Name: " + name);
        System.out.println("Second Name: " + secondName);
        System.out.println("Full Name: " + name + " " + secondName);
        System.out.println("PI: " + PI);
        System.out.println("Count: " + COUNT);
    }

}
