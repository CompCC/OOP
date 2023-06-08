package Sem3.Task2;

public class Worker extends Employee {

    public Worker(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная ЗП (фиксированная месячная оплата): %.2f (руб.); возраст: %d лет", surname, name, calculateSalary(), age);
    }

    @Override
    public double calculateSalary() {
        return salary;


    }
}
