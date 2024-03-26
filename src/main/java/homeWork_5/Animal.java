package homeWork_5;
//1. Создать родительский класс Animal с
//
//Свойствами protected:
//
//name, age, weight, color
//
//Методами:
//Getter and Setter
//Say(Вывод на экран: "Я говорю"),
//Go(Вывод на экран: "Я иду"),
//Drink(Вывод на экран: "Я пью"),
//Eat(Вывод на экран: "Я ем")
public class Animal {
    protected String name;

    protected int age;
    protected int weight;
    protected String color;

    public String say () {
        return "Я говорю";
    }

    public String go() {
        return "Я иду";
    }

    public String drink() {
        return  "Я пью";
    }

    public String eat() {
        return "Я ем";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


//1.1 Переопределить метод toString (Возврат строки: "Привет! меня зовут name,
// мне age лет(лет/год/года), я вешу - weight кг, мой цвет - color")
// лет или год, или года должно быть выбрано в зависимости от числа
//
//Примеры:
//Привет! меня зовут Бобик, мне 5 лет, я вешу - 15 кг, мой цвет - черный
//Привет! меня зовут Бобик, мне 1 год, я вешу - 15 кг, мой цвет - черный
//Привет! меня зовут Бобик, мне 2 года, я вешу - 15 кг, мой цвет - черный

@Override
public String toString () {
    String years = age == 1 ? "год" : (age >= 2 && age <= 4 ? "года" : "лет");
    return "Привет! меня зовут " + this.name + ", мне " + this.age + " " + years + ", я вешу - " + this.weight + " кг, "
            + "мой цвет - " + this.color;



}

}