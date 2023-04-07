package Alishev;

public class Arrays {
    public static void main(String[] args) {
        int [] array = new int[5]; // array -> [массив] ссылочный тип данных. Так создаётся пустой массив
        for (int i = 0; i < array.length; i++){
            array[i] = i*10;                // инициализация каждого элемента массива
            System.out.print(array[i]+ " ");
        }
        System.out.println();
       int[] array_2 = {1,2,2,3,4,5,6,7,8,9,90,}; // Массив с уже заполненными значениями
            for (int i = 0; i<array_2.length;i++){
                System.out.print(array_2[i] + " ");

            }

    }
}
