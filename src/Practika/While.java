package Practika;

// Используя цикл while вывести на экран сто раз цитату (переменная quote):
//«Я никогда не буду работать за копейки. Амиго»

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки.\n Амиго";
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            System.out.println(quote);
            a++;

        }
    }
}
// Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
//Каждый вывод - с новой строки.
//Пример вывода на экран для имени Света:
//public class While{
//    public static void main (String[] args) {
//    String text = " любит меня.";
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Введите имя: ");
//    String name = scanner.nextLine();
//    int i = 0;
//    while (i< 10){
//        System.out.println(name + text);
//        i++;
//    }
//
//    }
//
//}

//Напишем программу, в которой нужно вводить с клавиатуры целые числа и считать их сумму, пока пользователь не введет слово "ENTER".
//Вывести на экран полученную сумму и завершить программу.

//public class While {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        boolean isExit = false;
//        while (!isExit) {
//            if (scanner.hasNext()) {
//                int number = scanner.nextInt();
//                sum = sum + number;
//            } else if (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                if (line.equals("ENTER")) {
//                    isExit = true;
//                }
//
//
//            }
//        }
//    }
//}
