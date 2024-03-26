package homeWork_6;
//4. Создать класс дженерик который будет хранить поле и печатать его.
//4.1. Унаследовать дженерик от родительского класса и имплемитировать от интерфейса.

public class GenClass <T extends Cars & ICars>{
    T toPrint;
    public  GenClass (T toPrint){

        this.toPrint  = toPrint;
}
public void printData(){
    System.out.print(toPrint.model);
    System.out.print(toPrint.color);
    toPrint.refueling();
    }
}
