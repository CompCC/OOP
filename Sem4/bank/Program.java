package Sem4.bank;

public class Program {
    public static void main(String[] args) {
        DebetAccount<Entity> entityDebetAccount1 = new DebetAccount<>(new Entity("ООО Рога и Копыта", "1245621"), 50000);

        CreditAccount<Person> personCreditAccount1 = new CreditAccount<>(new Person("Пупкин Василий Алибабаевич", "462315"), 12.0);

        Transaction<Account<?>> transaction = new Transaction<>(entityDebetAccount1, personCreditAccount1, 26000);
        transaction.execute();
        transaction.execute();

    }
}
