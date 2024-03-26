package homeWork_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class Homework_2 {
    public static void main(String[] args) {


        String text = "Hello world!!!!";
        int countText = text.length();
        int evenNubber = countText % 2;
        if (evenNubber == 0)
            System.out.println(text.substring(countText / 2 - 1, (countText / 2) + 1));
        else
            System.out.println(text.substring(countText / 2, countText / 2 + 1));



/*Даны строки:
String first = Hello world;
String second = Hello world;
Написать тест, с использованием анотации @Test, в котором проверяется, что содержимое first и second равно.
При написании использовать assertTrue.
 */

    }
    @Test
    public void test() {
    String first = "Hello world";
    String second = "Hello world";
        System.out.println("First line: " + first + "\n" + "Second line: " + second);
        assertTrue(first==second);


        /*Из строки состоящей из 6 слов удалить все числовые символы, вывести получившуюся строку на экран.
         Вывести отдельно слова начинающиеся с буквы "д"(регистр не важен), каждое слово с новой строки.
         Программа должна работать с любой строкой, состоящей из 6 слов. Использовать методы replaceAll() и split().
          Пример строки:
        1С2е3г4о3д22н111я о111т3ли7чн88ый 3де344н5ь 4ч3т555обы7 345вы2у3ч2ить 1Д1ж22а9в88у4

        Пример вывода:
        Сегодня отличный день чтобы выучить Джаву
        день
                Джаву

        */






        String text = "1С2е3г4о3д22н111я о111т3ли7чн88ый 3де344н5ь 4ч3т555обы7 345вы2у3ч2ить 1Д1ж22а9в88у4";
        String textWithoutNumbers = text.replaceAll(("[0-9]"), "");
        String textWithoutNumbersLowerCase  = textWithoutNumbers.toLowerCase();
        System.out.println(textWithoutNumbers);
        String [] wordsInText = textWithoutNumbersLowerCase.split(" ");
        String oneWordInText = wordsInText[0];
        String twoWordInText = wordsInText[1];
        String threeWordInText = wordsInText[2];
        String fourWordInText = wordsInText[3];
        String fiveWordInText = wordsInText[4];
        String sixWordInText = wordsInText[5];
           if ((oneWordInText.indexOf('д')==0)) {
            System.out.println(oneWordInText);
        }
        if ((twoWordInText.indexOf('д')==0)) {
            System.out.println(twoWordInText);
        }
        if ((threeWordInText.indexOf('д')==0)) {
            System.out.println(threeWordInText);
        }
        if ((fourWordInText.indexOf('д')==0)) {
            System.out.println(fourWordInText);
        }
        if ((fiveWordInText.indexOf('д')==0)) {
            System.out.println(fiveWordInText);
        }
        if ((sixWordInText.indexOf('д')==0)) {
            System.out.println(sixWordInText);
        }
        else {
            System.out.println("В тексте нет слов, начинающихся с буквы д");
        }
}
}
