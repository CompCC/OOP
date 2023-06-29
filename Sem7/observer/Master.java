package Sem7.observer;

import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();
    private String name;

    private double minSalary;

    private Vacancy myVacancy;

    public Master(String name, Vacancy myVacancy) {
        this.name = name;
        this.myVacancy = myVacancy;
        minSalary = random.nextDouble(80000, 100000);
    }

    @Override
    public void reciveOffer(String nameCompany, double salary, Vacancy vacancy) {

       if (myVacancy == vacancy) {
            if (minSalary <= salary) {
                System.out.printf("Мастер %s (%f) на должность %s >>> Мне нужна эта работа! (%s - %f) на должность %s\n", name, minSalary, myVacancy, nameCompany, salary, vacancy);
                minSalary = salary;
            } else {
                System.out.printf("Мастер %s (%f) на должность %s >>> Я найду работу получше! (%s - %f) на должность %s\n", name, minSalary, myVacancy, nameCompany, salary, vacancy);
            }
        }
    }
}

