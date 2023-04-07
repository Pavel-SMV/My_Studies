package Alishev;

public class For {
    public static void main(String[] args) {
        for(int i = 10 ;i >= 0; i--){ // i = переменная - счётчик
            System.out.println("Hello " + i);
            for (int j = 0; j<5; j--);
            System.out.println("Ещё раз привет");
        }
    }
}
