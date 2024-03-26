package homeWork_3;

import java.util.Random;

/*       Создать массив 5х5, в цикле заполнить его случайными символами с использованием Random. Каждую из строк массива отсортировать по возрастанию, без использования sort().
                Пример:
        34234
        23452
        12543
        98734
        03475
        Вывод:
        23344
        22345
        12345
        34789
        03457
  */

public class HomeWork_3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

       Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Массив до сортировки: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        // Здесь должна быть сортировка пузырьком, но увы удалось решить только при помощи гуглежки, поэтому решение не привожу
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4 - j; k++) {
                    if (array[i][k] > array[i][k + 1]) {
                        int temp = array[i][k];
                        array[i][k] = array[i][k + 1];
                        array[i][k + 1] = temp;
                    }
                }
            }
        }

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


 /*       Создать массив 5х5, в цикле заполнить его случайными символами с использованием Random. Каждую из строк массива отсортировать по возрастанию, без использования sort().
                Пример:
        34234
        23452
        12543
        98734
        03475
        Вывод:
        23344
        22345
        12345
        34789
        03457
  */

