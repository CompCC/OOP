package Sem2.domZadanie;

public class Programm {
    public static void main(String[] args) {
        Cat cat = new Cat("Рыжий", 10);
        Cat cat1 = new Cat("Барсик", 13);
        Cat cat2 = new Cat("Пресик", 5);
        Plate plate = new Plate(10);


        plate.info();
        cat1.eat(plate);
        plate.info();



    }
}
