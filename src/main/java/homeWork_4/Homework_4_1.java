package homeWork_4;

import java.text.SimpleDateFormat;
import java.util.HashMap;

public class Homework_4_1 {

//Создать словарь, заполнить данными ключ: Фамилия, значение: Дата рождения, минимум 10 ключей. Вывести словарь на экран.
// Удалить все значения с датой попадающей в летний период, вывести словарь на экран.
public static void main(String[] args) {
      SimpleDateFormat dateFormat  = new SimpleDateFormat("dd-MM-yyyy");
    //Date dateOfBirth = new Date("dd-MM-yyyy");
     HashMap<String, SimpleDateFormat> dictionary = new HashMap<String, SimpleDateFormat>();
      dictionary.put("Ivanov", new SimpleDateFormat("12-12-2012"));
      System.out.println(dictionary);
}}




