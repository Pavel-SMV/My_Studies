package OOP_test;

public class Animal implements Info {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println(this.name);
    }
}
