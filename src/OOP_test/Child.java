package OOP_test;

public class Child extends Person {
    String gender;
    public Child(int age, String name,String gender) {
        super(age, name);
        this.gender= gender;

    }

    public void Child() {
        System.out.print(this.name + " " + this.age+ " " + this.gender + " is Pavel and Inna's child");
        System.out.println();


    }
}

