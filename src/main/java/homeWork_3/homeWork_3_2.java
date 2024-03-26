package homeWork_3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class homeWork_3_2 {
    @Test
    public void testRemove() {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.remove(2);
        // Проверяем, что элемент был успешно удален
        assertFalse(myArrayList.contains(3));
    }

    @Test
    public void testClear() {
        ArrayList<Integer> myArrayListTwo = new ArrayList<>();
        myArrayListTwo.add(1);
        myArrayListTwo.add(2);
        myArrayListTwo.add(3);
        myArrayListTwo.clear();
        // Проверяем, что список пуст после очистки
        assertTrue(myArrayListTwo.isEmpty());
    }
}
