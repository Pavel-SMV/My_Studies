package OOP_test;

public class Main {
    public static void main(String[] args) {
        Parents Pavel = new Parents("Pavel", 33);
        System.out.println("[" + Pavel.name + " " + Pavel.age+ "]");
        Parents Inna = new Parents("Inna", 32);
        System.out.println("[" + Inna.name + " " + Inna.age+ "]");
        Child Katrin = new Child(8,"Katrin","women");
        Katrin.Child();
        Child Ksy = new Child(2,"Ksy","women");
        Ksy.Child();
        Animals animals = Animals.Dog;
        Pavel.showInfo();
        Animal animal = new Animal(" Pesik");
        animal.showInfo();




    }
}
