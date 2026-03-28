package objects;

public class Main {
    public static void main(String[] args) {

        // Создание экземпляров класса Person
        Person person2 = new Person("Alice");
        Person person3 = new Person("Alex");

        System.out.println("Person 2 COUNT: " + Person.COUNT);
        System.out.println("Person 3 COUNT: " + person3.COUNT);

        System.out.println("Person 2 Name: " + person2.getName());
        person2.setName("Alex");
        System.out.println("Person 2 Name after update: " + person2.getName());

        // Вызов метода printNameAndSecodName
        person2.printNameAndSecodName("Alice", "Smith");
    }
}
