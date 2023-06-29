package Sem7.observer;

public class Program {
    /**
     * Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     * * добавить новый тип соискателя.
     * * Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * * Только после этого вы можете усложнить ваше приложение (при желании), например,
     *   добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */



    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Company geekBrains = new Company("GeekBrains", 70000,Vacancy.administrator,jobAgency);
        Company google = new Company("Google", 100000,Vacancy.programmer, jobAgency);
        Company yandex = new Company("Yandex", 120000,Vacancy.cleaner, jobAgency);

        Master petrov = new Master("Petrov",Vacancy.administrator);
        Master sidorov = new Master("Sidorov",Vacancy.programmer);
        Student ivanov = new Student("Ivanov",Vacancy.cleaner);
        Middle petrov1 = new Middle("Petrov1",Vacancy.security);

        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov1);


        for (int i = 0; i < 5; i++) {
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }
}
