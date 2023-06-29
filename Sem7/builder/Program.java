package Sem7.builder;

public class Program {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .setClientName("Name")
                .setQnt(3)
                .setProduct("Product")
                .setPrice(123)
                .build();

    }
}
