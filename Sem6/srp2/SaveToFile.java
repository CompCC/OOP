package Sem6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {

    private final Order order;

    public SaveToFile(Order order) {
        this.order = order;
    }

    public void saveToJson() {
        String filename = "order.json";
        try (FileWriter writer = new FileWriter(filename, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
