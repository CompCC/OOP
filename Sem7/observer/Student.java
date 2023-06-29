package Sem7.observer;

import java.util.Random;

public class Student implements Observer {

    private  static Random random = new Random();
    private String name;

    private double minSalary;

    private Vacancy myVacancy;

    public Student(String name, Vacancy myVacancy) {
        this.name = name;
        this.myVacancy = myVacancy;
        minSalary = random.nextDouble(2000,3000);
    }

    @Override
    public void reciveOffer(String nameCompany, double salary, Vacancy vacancy) {

        if (myVacancy == vacancy) {
            if (minSalary <= salary) {
                System.out.printf("Студент %s (%f) на должность %s >>> Мне нужна эта работа! (%s - %f) на должность %s\n", name, minSalary, myVacancy, nameCompany, salary, vacancy);
                minSalary = salary;
            } else {
                System.out.printf("Студент %s (%f) на должность %s >>> Я найду работу получше! (%s - %f) на должность %s\n", name, minSalary, myVacancy, nameCompany, salary, vacancy);
            }
        }
    }
}
