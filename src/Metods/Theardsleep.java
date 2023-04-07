package Metods;

public class Theardsleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i > 0; i--)
        {
            System.out.println(i);
            Thread.sleep(500);// Метод Thread.sleep
        }

        System.out.println("Поехали !");
    }
}
