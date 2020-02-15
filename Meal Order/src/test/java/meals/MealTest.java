package meals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealTest {
    Meal meal = new Meal(12);


    @Test
    void shouldReturnDiscountPrice() {
        //when
        int newPrice = meal.discountedPrice(3);

        //then
        assertEquals(9, newPrice);
    }

    @Test
    void referencesToSameObjectShouldBeEquals() {
        //given
        Meal meal1 = new Meal(12);
        Meal meal2 = meal1;

        //then
        assertSame(meal1, meal2);
    }
    @Test
    void referencesToDifferentObjectShouldNotBeEquals() {
        //given
        Meal meal1 = new Meal(12);
        Meal meal2 = new Meal(12);

        //then
        assertNotSame(meal1, meal2);
    }
    @Test
    void twoMealsShouldBeTheSameWithTheSameName() {
        //given
        Meal meal1 = new Meal(12, "Hamburger");
        Meal meal2 = new Meal(12, "Hamburger");

        //then
        assertEquals(meal1, meal2);
    }

}