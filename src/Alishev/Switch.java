package Alishev;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст: ");
        String age = scanner.nextLine();
        switch (age){
            case "Ноль":
                System.out.println("Ты родился");
                break;
            case "Семь":
                System.out.println("Ты пошёл в школу");
            default:
                System.out.println("Ни одно из условий не подошло");
        }

    }
}
