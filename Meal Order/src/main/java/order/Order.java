package order;

import meals.Meal;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private OrderStatus orderStatus;

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    private List<Meal> meals=new ArrayList<>();

    public List<Meal> getMeals() {
        return meals;
    }
    int totalPrice() {

        int sum = this.meals.stream().mapToInt(meal -> meal.getPrice()).sum();

        if(sum < 0) {
            throw new IllegalStateException("Price limit exceeded");
        } else {
            return sum;
        }
    }

    public void addMealToOrder(Meal meal){
        this.meals.add(meal);
        System.out.println("Dodano 1 meal");

    }
    public void removeOrder(Meal meal){
        this.meals.remove(meal);
        System.out.println("usunęto 1 meal");
    }

    void cancel(){
        this.meals.clear();
    }
public void changeOrderStatus(OrderStatus orderStatus)
{
    this.orderStatus=orderStatus;
}
}
