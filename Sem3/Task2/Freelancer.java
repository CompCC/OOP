package Sem3.Task2;

import java.util.Random;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 *  ставка*20*8
 */
public class Freelancer extends Employee {

    public Freelancer(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; ЗП (ставка*20*8): %.2f (руб.); возраст: %d лет", surname, name, calculateSalary(), age);
    }

    @Override
    public double calculateSalary() {
        Random random = new Random();
        int rate = random.nextInt(500, 1000);
        return rate * 20 * 8;
    }
}
