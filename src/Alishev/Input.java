package Alishev;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        String s = new String("fjfjgk");
        Scanner sc = new Scanner(System.in);// В скобках задаётся входной поток
        System.out.println("Введите что-нибудь:");
        String string = sc.nextLine(); // в переменной String хранится то что мы ввели с клавиатуры
        System.out.println("Вы ввели: " + string);
        sc.close();

    }
}
