package Sem7.observer;

import java.util.Random;

public class Company {

    private static Random random = new Random();

    private String nameCompany;

    private double maxSalary;

    private Vacancy vacancy;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Vacancy vacancy, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.vacancy = vacancy;
        this.jobAgency = jobAgency;
    }

    public void needEmployee() {
        double salary = random.nextDouble(2500, 150000);
        jobAgency.sendOffer(nameCompany, salary, vacancy);
    }
}
