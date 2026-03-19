package objects;

public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
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
    }
}
