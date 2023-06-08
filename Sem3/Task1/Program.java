package Sem3.Task1;

/**
 *     Создать классы Собака и Кот с наследованием от класса Животное.
 *     Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 *     Результатом выполнения действия будет печать в консоль. (Например, dog1.run(150); -> 'Бобик пробежал 150 м.');
 *     У каждого животного есть ограничения на действия
 *     (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 *     Добавить подсчет созданных котов, собак и животных.
 */
public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Макс");
        System.out.println(cat1.getId());
        cat1.run(10);

        Cat cat2 = new Cat("Пушок");
        System.out.println(cat2.getId());
        cat2.swim(2);

        Cat cat3 = new Cat("Редиска");
        System.out.println(cat3.getId());
        cat3.run(500);

        Dog dog1 = new Dog("Кнопка");
        System.out.println(dog1.getId());
        dog1.run(500);

        Dog dog2 = new Dog("Жучка");
        System.out.println(dog2.getId());
        dog2.swim(5);

        Dog dog3 = new Dog("Рекс");
        System.out.println(dog3.getId());
        dog3.run(600);

        System.out.printf("Было создано %d котов\n", Cat.getCatCounter());
        System.out.printf("Было создано %d собак\n", Dog.getCounter());
        System.out.printf("Было создано %d животных\n", Animal.getCounter());


    }
}
