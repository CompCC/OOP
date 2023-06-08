import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
        // product1.brand = "ООО Чистый источник";
        // product1.name = "Бутылка с водой";
        // product1.price = 125.15;

        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый источник", "Бутылка с водой#2", 90.15);
        // product2.brand = "ООО Чистый источник";
        // product2.name = "Бутылка с водой#2";
        // product2.price = 90.15;
        product2.setPrice(-30);

        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой#3", 90.15, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком#1", 90.15, 1.5, 10);
        System.out.println(bottleOfMilk.displayInfo());

        Product chocolate = new Chocolate("Россия", "Богатырский", 150.50, "Черный", 150);
        System.out.println(chocolate.displayInfo());

        Product chocolate2 = new Chocolate("Milka", "Oreo",200, "Белый", 100);
        System.out.println(chocolate2.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk);
        products.add(chocolate);
        products.add(chocolate2);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        if (bottleOfWaterResult != null) {
            System.out.print("Вы купили: ");
            System.out.println(bottleOfWaterResult.displayInfo());
        }
        else{
            System.out.println("Такой бутылки нет в автомате!");
        }

        VendingMachine vendingMachine2 = new VendingMachine(products);
        Chocolate chocolateResult = vendingMachine2.getChocolate(150);
        if (chocolateResult != null) {
            System.out.print("Вы купили: ");
            System.out.println(chocolateResult.displayInfo());
        }
        else{
            System.out.println("Такого шоколада в автомате нет!");
        }
    }
}
