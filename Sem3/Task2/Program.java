package Sem3.Task2;

import java.util.Arrays;
import java.util.Random;

public class Program {
    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов Freelancer/Worker.
     *
     *
     */
    static Employee generateEmplyee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surname = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        int salaray = random.nextInt(20000, 80000);
        int age = random.nextInt(20, 65);
        int temp = random.nextInt(0, 2);
        if (temp == 0) {
            return new Worker(names[random.nextInt(names.length)], surname[random.nextInt(surname.length)], salaray, age);
        } else {
            return new Freelancer(names[random.nextInt(names.length)], surname[random.nextInt(surname.length)], salaray, age);
        }

    }

    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     *
     *
     */

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmplyee();
        }

        Arrays.sort(employees); //, new SalaryComparator()

        for (Employee employee : employees) {
            System.out.println(employee);
        }


    }
}
