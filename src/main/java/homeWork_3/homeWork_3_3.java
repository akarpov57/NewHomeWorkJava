package homeWork_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class homeWork_3_3 {
    public static void main(String[] args) {
        // Создание ArrayList и LinkedList
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(random.nextInt(10));
        }
        long arrayListAddTime = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(random.nextInt(10));
        }
        long linkedListAddTime = System.currentTimeMillis() - startTime;
        System.out.println("Время добавления в ArrayList: " + arrayListAddTime + " мс");
        System.out.println("Время добавления в LinkedList: " + linkedListAddTime + " мс");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int index = random.nextInt(arrayList.size());
            arrayList.get(index);
        }
        long arrayListGetTime = System.currentTimeMillis() - startTime;


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int index = random.nextInt(linkedList.size());
            linkedList.get(index);
        }
        long linkedListGetTime = System.currentTimeMillis() - startTime;

        System.out.println("Время доступа к элементам в ArrayList: " + arrayListGetTime + " мс");
        System.out.println("Время доступа к элементам в LinkedList: " + linkedListGetTime + " мс");
    }
}
