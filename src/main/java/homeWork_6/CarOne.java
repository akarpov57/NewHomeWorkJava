package homeWork_6;
//3. Создать 2 класса автомобиля.
//Для 2-х классов добавить:
//3.1. Добавить конструктор и в аргумент добавить поля модели и цвета автомобиля.
//3.2. Преопределить метод родительского класса и добавить вывод на экран каким видом топлива автомобиль заправляется.
//Пример: Я заправляюсь бензином.
public class CarOne extends Cars {
public CarOne (String model, String color){
        this.model = model;
        this.color = color;
        }
@Override
public void refueling() {
    super.refueling();
    System.out.println(" benzin");
}
    }

