public class Chocolate extends Product {
    private String chocolateColor; // цвет шоколада
    private int weight; // вес плитки
    
    public String getChocolateColor() {
        return chocolateColor;
    }
    public void setChocolateColor(String chocolateColor) {
        this.chocolateColor = chocolateColor;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Chocolate(String brand, String name, double price, String chocolateColor, int weight) {
        super(brand, name, price);
        this.chocolateColor = chocolateColor;
        this.weight = weight;
    }
    @Override
    public String displayInfo() {
        
        return String.format("[Шоколад]%s - %s - %f [вес: %d; цвет %s]", brand, name, price, weight, chocolateColor);
    }

    

}
