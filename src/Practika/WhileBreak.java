package Practika;

//Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
//Слово "enough" выводить не нужно.
//Для этого необходимо использовать бесконечный цикл (while(true)).
//
//Подсказка: чтобы завершить бесконечный цикл, используй оператор break.

import java.util.Scanner;

public class WhileBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что-нибудь :");
        while (true) {

            String s = scanner.nextLine();

            if (s.equals("Хорош"))
                break;

            System.out.println(s);
            System.out.println("Ещё!");
        }

    }
}