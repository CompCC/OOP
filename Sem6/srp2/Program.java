package Sem6.srp2;

public class Program {
    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        OrderFactory orderFactory = new OrderFactory();
        orderFactory.createOrder();
//        SaveToFile saveToFile = new SaveToFile(orderFactory);
//        saveToFile.saveToJson();
//        order.saveToJson();
    }
}
