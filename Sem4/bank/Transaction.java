package Sem4.bank;

public class Transaction<T extends Account<? extends PersonalData>> {

    private final T from;

    private final T to;

    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute() {
        if (from.getAmount() > amount) {
            System.out.printf("Осуществлен перевод средств между счетами на сумму %.2f руб.\n", amount);
            System.out.printf("Счет списания № %s: %.2f руб.\nСчет зачисления № %s: %.2f руб.\n", from.getData(), from.getAmount(), to.getData(), to.getAmount());
            from.setAmount(to.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);

            System.out.println("Текущее состояие счетов:");
            System.out.println(from);
            System.out.println(to);
        } else {
            System.out.println("Операция невозможна, недостаточно средств на счете.");
        }

    }
}
