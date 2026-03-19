package objects;

public class Person {
    String name;
    
    // Constructor for the Person class явныйно не нужен, так как Java предоставляет конструктор по умолчанию, но мы можем его добавить для ясности
    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }
}
