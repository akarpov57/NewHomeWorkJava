package homeWork_5;


//6. В классе Main:
//Создать объекты для Cat, Dog и Duck.
//К полям name, age, weight, color присвоить значения.
//Для Cat и Dog для вывода добавить метод say.
//Для Duck для вывода добавить методы fly и say.

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        cat.setName("Murka");
        cat.setAge(18);
        cat.setWeight(10);
        cat.setColor("white");

        dog.setName("Bim");
        dog.setAge(12);
        dog.setWeight(18);
        dog.setColor("black");

        duck.setName("Donald");
        duck.setAge(8);
        duck.setWeight(8);
        duck.setColor("gray");


        System.out.println(cat.getName() + " " +  cat.getAge() + " " + cat.getWeight() + " " + cat.getColor() + " " + cat.say());
        System.out.println(dog.getName() + " " + dog.getAge() + " " + dog.getWeight() + " " + dog.getColor() + " " + dog.say());
        System.out.println(duck.getName() + " " + duck.getAge() + " " + duck.getWeight() + " " + duck.getColor() + " " + duck.say() + " " + duck.fly());






        //Привет! меня зовут Бобик, мне 5 лет, я вешу - 15 кг, мой цвет - черный
/*Animal exampleAnimal = new Animal();
exampleAnimal.setName("Bobik");
exampleAnimal.setAge(5);
exampleAnimal.setWeight(15);
exampleAnimal.setColor("black");
System.out.println(exampleAnimal.toString());
*/



    }

}
