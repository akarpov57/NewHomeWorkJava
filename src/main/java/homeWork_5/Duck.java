package homeWork_5;
//5. Создать класс Duck и унаследовать его от Animal, реализовать интерфейс Flying
//Добавить конструктор по умолчнию
//Переопределить метод say(Вывод на экран: "Кря")
//Реализовать метод fly(Вывод на экран: "Я лечу")
public  class Duck extends Animal implements IFlying {
    public Duck(){
    }
    @Override
    public String say () {
        return "Кря";
    }
    @Override
        public String fly () {
        return "Я лечу";
    }
}
