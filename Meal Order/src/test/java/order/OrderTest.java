package order;

import meals.Meal;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order order;

    @BeforeEach
    void newOrderCreate() {
        order = new Order();
    }
    @AfterEach
    void cleanUp(){
        order.cancel();
    }
    /*
        @Test
        void testAssetEquals(){
            int [] tabel1={1,2,3};
            int [] tabel2={1,2,4};
    //    assertThat(tabel1,equalTo(tabel2));
        assertArrayEquals(tabel1,tabel2);
        }
    */
    @Test
    void mealListShouldBeEmptyAfterCreationOrder() {
     //   Order order = new Order();
        assertThat(order.getMeals(), empty());
/*    assertThat(order.getMeals(), hasSize(0));
    assertThat(order.getMeals().size(), equalTo(0));
    assertThat(order.getMeals(),is(emptyCollectionOf(Meal.class)));*/
    }

    @Test
    void mealListShouldNotBeEmptyAfterAddingOrder() {
        //given
//        Order order = new Order();
        Meal meal = new Meal(12, "Hamburger");
        Meal meal1 = new Meal(15, "hot-dog");
//when
        order.addMealToOrder(meal);
        order.addMealToOrder(meal1);
//then
        //  assertThat(order.getMeals().size(),equalTo(1));
//    assertThat(order.getMeals(),hasSize(1));
        //   assertThat(order.getMeals(),not(emptyCollectionOf(Meal.class)));
        assertThat(order.getMeals(), contains(meal, meal1));  //<-tu musi być w kolejności
        assertThat(order.getMeals(), hasItem(meal1));

    }

    @Test
    void mealListShouldBeSmallerAfterDeletingOrder() {
        //given
//        Order order = new Order();
        Meal meal = new Meal(12, "Hamburger");
        Meal meal1 = new Meal(15, "hot-dog");
//when
        order.addMealToOrder(meal);
        order.addMealToOrder(meal1);

        order.removeOrder(meal);
        order.removeOrder(meal1);
        assertThat(order.getMeals(), not(hasItem(meal)));
        assertThat(order.getMeals(), not(containsInAnyOrder(meal)));
        assertThat(order.getMeals(), hasSize(0));
    }
@Test
        void orderTotalPriceShouldNotExceedMaxIntValue(){
        Meal meal1 = new Meal(Integer.MAX_VALUE, "Hamburger");
        Meal meal2 = new Meal(Integer.MAX_VALUE, "Hot-dog");
        // Order order=new Order();
        order.addMealToOrder(meal1);
        order.addMealToOrder(meal2);

    assertThrows(IllegalStateException.class,()->order.totalPrice());}

@Test
    void emptyOrderTotalPriceShouldBeZero(){
        assertTrue(order.totalPrice()==0);
}
}