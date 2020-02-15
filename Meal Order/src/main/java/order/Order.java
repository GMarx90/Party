package order;

import meals.Meal;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Meal> meals=new ArrayList<>();

    public List<Meal> getMeals() {
        return meals;
    }
    public void addMealToOrder(Meal meal){
        this.meals.add(meal);
        System.out.println("Dodano 1 meal");

    }
    public void removeOrder(Meal meal){
        this.meals.remove(meal);
        System.out.println("usunęto 1 meal");
    }
}
