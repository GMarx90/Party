package users;

import meals.Meal;
import order.Order;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void cartShouldBeFillbyOrderwhenAddedOrder() {
        //given
        Cart cart =new Cart();
        Order order= new Order();
        Meal meal =new Meal(33, "beef");
        Meal meal1 =new Meal(25, "hamster");

        //when
        order.addMealToOrder(meal);
        order.addMealToOrder(meal1);
        cart.addOrderToCart(order);


        //then
        assertThat(cart.getUserOrder().size(),equalTo(1));
        assertThat(cart.getUserOrder(),anyOf(
                contains(order),
        containsInAnyOrder(order)));
    assertThat(cart.getUserOrder().get(0).getMeals().get(1).getPrice(),equalTo(25));
    }

    @Test
    void cartShouldBeClearedWhenOrderIsComplited() {
        //given
        Cart cart =new Cart();
        Order order= new Order();
        Order order1= new Order();
        Meal meal =new Meal(33, "beef");
        Meal meal1 =new Meal(25, "hamster");

        //when
        order.addMealToOrder(meal);
        order.addMealToOrder(meal1);
        cart.addOrderToCart(order);
        cart.addOrderToCart(order1);
    //when 2 ;p

        cart.clearCart();
        assertThat(cart.getUserOrder(),is(empty()));
    }

    @Test
    void simulateLargeOrder() {
        Cart cart =new Cart();
        assertTimeout(Duration.ofMillis(100), cart::simulateLargeOrder);
    }
}