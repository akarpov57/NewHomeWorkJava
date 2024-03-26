package homeWork_1;

import java.util.Scanner;

public class Homework_1 {
    public static void main(String[] args) {
        int a = 987;
        int a_1 = (a/100)%10;
        int a_2 = (a/10)%10;
        int a_3 = a%10;
        int b = a_1 + a_2 * 10 + a_3 *100;
        System.out.println(a_1);
        System.out.println(a_2);
        System.out.println(a_3);
        System.out.println(b);
         if (a < b){
      System.out.println("Число " + a + " меньше " + b);}
        else if (a == b){
                System.out.println("Число " + a + " равно числу " + b);}
            else {
             System.out.println("Число " + a + " больше " + b);
             System.out.println(a==b);
         }




        float price_1 = 10.5f;
        int price_2 = 45;
        float price_1_sale = price_1 * 0.95f;
        float price_2_sale = price_2 * 0.85f;
        float sum_with_sale = price_1_sale + price_2_sale;

        System.out.println("Стоимость двух товаров с учетом скидок равна " + sum_with_sale);
        System.out.println("Стоимость двух товаров А и четырех товаров B с учетом скидок равна " + (price_1_sale * 2 + price_2_sale * 4));
        System.out.println("Стоимость двух товаров А и четырех товаров B без скидок равна " + (price_1 * 2 + price_2 * 4));

        int craftBeer = 3;
        Scanner in = new Scanner(System.in);
        System.out.print("Сколько пива пацанам нальешь: ");
        int freeCraftBeer = in.nextInt();
        if (freeCraftBeer>craftBeer){
            System.out.println("Мы придем");}
        else System.out.println("Ты жадная морда");


  // int a = 1389;
  //  int summ = ((a% 10) + (a / 10) % 10 + (a / 100) % 10 + (a/1000) % 10);
  //  boolean result = summ <= 20;
    //    if (result == true)
   //         System.out.println("Cумма  цифр меньше или равна 20: " + result);
    //    else
    //        System.out.println ("Сумма  цифр больше 20: " + result);





        int a1 = 1389;
        int summ1 = ((a1% 10) + (a1 / 10) % 10 + (a1 / 100) % 10 + (a1/1000) % 10);
      switch (summ1) {
          case 0:
              System.out.println("true");
              break;
            case 1:
             System.out.println("true");
                break;
          case 2:
              System.out.println("true");
              break;
          case 3:
              System.out.println("true");
              break;
          case 4:
              System.out.println("true");
              break;
          case 5:
              System.out.println("true");
              break;
          case 6:
              System.out.println("true");
              break;
          case 7:
              System.out.println("true");
              break;
          case 8:
              System.out.println("true");
              break;
          case 9:
              System.out.println("true");
              break;
              case 10:
              System.out.println("true");
                  break;
          case 11:
              System.out.println("true");
              break;
          case 12:
              System.out.println("true");
              break;
          case 13:
              System.out.println("true");
              break;
          case 14:
              System.out.println("true");
              break;
          case 15:
              System.out.println("true");
              break;
          case 16:
              System.out.println("true");
              break;
          case 17:
              System.out.println("true");
              break;
          case 18:
              System.out.println("true");
              break;
          case 19:
              System.out.println("true");
              break;
          case 20:
              System.out.println("true");
              break;
          default: System.out.println("false: сумма  цифр больше 20");
        }
    }
}


