package Sem4.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 * b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 * c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 * d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 * e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
 * подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 * Можно сравнивать коробки с яблоками и апельсинами;
 * f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 * g. Не забываем про метод добавления фрукта в коробку.
 */
public class Program {
    public static void main(String[] args) {
        Box box1 = new Box();
        //кладем в нее 3 яблока
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        // проверяем сколько весит коробка
        System.out.println("Вес коробки №1: " + box1.getWeight());
        // Создаем другую коробку
        Box box2 = new Box();
        //кладем в нее 3 яблока
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        // проверяем сколько весит коробка
        System.out.println("Вес коробки №2: " + box2.getWeight());
        // сравним две коробки
        System.out.println("Результат работы метода compare() класса Box, параметры (пример: box1.compare(box2))");
        System.out.println("Массы коробок " + (box1.compare(box2) ? "одинаковы" : "различны") + ".");
        // Проверка, а какие фрукты хранятся в каждой коробке
        // прямой способ получение ссылки на ArrayList и потом определение типа первого элемента
        // (аналог) открыли коробку и посмотрели что сверху
        System.out.println("В коробке Box1 хранятся " + box1.getProduct().get(0).getClass().getSimpleName());
        // создаем дополнительно еще одну коробку с яблоками
        Box box3 = new Box();
        //кладем в нее 3 яблока
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        // проверяем сколько весит коробка
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("В коробке Box3 хранятся " + box3.getProduct().get(0).getClass().getSimpleName());
        // пересыпаем яблоки из коробки 1 в коробку 3
        box1.shiftSingleItem(box3);
        // проверяем сколько весит коробка 3
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №1: " + box1.getWeight());
        // а теперь попробуем апельсины выгрузить в яблоки
        try {
            box2.shiftSingleItem(box3);
        } catch (BoxCustomException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №2: " + box2.getWeight());
        // попытаемся положить несколько апельсинов в коробку с яблоками
        try {
            box3.add(new Orange());
            box3.add(new Orange());
            box3.add(new Orange());
        } catch (BoxCustomException e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());

        // все работает
    }

    // Метод работает с обобщенным типом данных, теперь ему все равно какой массив придет на вход.
    public static <T> void SwapTwoArrayElements(T[] modifiableArray, int elemNum1, int elemNum2) {
        T backupElement = modifiableArray[elemNum1];
        modifiableArray[elemNum1] = modifiableArray[elemNum2];
        modifiableArray[elemNum2] = backupElement;
    }

    // Метод работает с обобщенным типом данных также как и метод swapTwoArrayElements
    public static <T> void convertArrayToArrayList(ArrayList<T> listArray, T[] convertedArray) {
        for (T elem : convertedArray) {
            listArray.add(elem);
        }
    }


}

