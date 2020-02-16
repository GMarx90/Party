package cart;

import meals.Meal;
import order.Order;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Order> userOrder = new ArrayList<>();
    public void addOrderToCart(Order order){
        userOrder.add(order);
        System.out.println("Your order has been added to cart");
    }
    public void clearCart(){
        userOrder.clear();
        System.out.println("Your order is reject cart is empty!");
    }
    //Ile zamówień na raz

    public List<Order> getUserOrder() {
        return userOrder;
    }

    public void simulateLargeOrder(){
        for (int i = 0; i<1000; i++) {
            Meal meal = new Meal(i%10, "Hamburger"+i);
            Order order =new Order();
            order.addMealToOrder(meal);
        addOrderToCart(order);}
        System.out.println("cart size"+userOrder.size());
        userOrder.clear();
    }
}
