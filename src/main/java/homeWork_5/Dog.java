package homeWork_5;
//4. Создать класс Dog и унаследовать его от Animal
//Добавить конструктор по умолчнию
//Переопределить метод say(Вывод на экран: "Гав")
public class Dog extends Animal{
    public Dog(){
    }
    @Override
    public String say () {
        return "Гав";
    }
}
