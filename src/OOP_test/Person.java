package OOP_test;

public class Person implements Info{
    public String name;
    public int age;

    public void say(String name) {
        System.out.println("Hello" + " " + name + " ! ");
    }
    public Person(int age) {
        this.age = age;
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
}

