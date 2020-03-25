package chapter_1.animals_examples;

public class Animal {

    private String name;

    private int age;

    public Object saySomething() {
        return 0;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " is " + age + " years old";
    }
}
