package homeWork_6;
//1. Создать родительский класс для машин.
//1.1. Добавить в родительский класс поля модели и цвета автомобиля.
//1.2. Добавить в родительский класс метод который будет выводить на консоль "Я заправляюсь"
public class Cars implements ICars {

        protected String model;

        protected String color;

        public void refueling () {
            System.out.print("I am refueling");
        }
}
