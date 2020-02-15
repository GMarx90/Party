package meals;

import java.util.Objects;

public class Meal {

    private int price;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public Meal(int price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    Meal(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return price == meal.price &&
                Objects.equals(name, meal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }

    public Meal(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    int discountedPrice(int discount) {
        if (discount>this.price){
            throw new IllegalArgumentException("discount mustn't be bigger than price!");
        }
        int discountedPrice = price - discount;
        return discountedPrice;
    }
}