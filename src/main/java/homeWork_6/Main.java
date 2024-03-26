package homeWork_6;

//Добавить реализацию класса дженерника(Из п.4) и в аргументы передать данные для классов автомобиля.

public class Main {
    public static void main(String[] args) {
    GenClass <CarOne> carOne = new GenClass<>(new CarOne("Lada Sedan", " eggplant: "));
    carOne.printData();

    GenClass <CarTwo> carTwo = new GenClass<>(new CarTwo("Lada Xray", " gray: "));
    carTwo.printData();
}}




