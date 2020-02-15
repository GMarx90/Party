package order;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class OrderStatusTest {


    @ParameterizedTest
    @EnumSource(OrderStatus.class)
    void allOrderStatusShouldBeLessThen15Chars(OrderStatus orderStatus) {
        assertThat(orderStatus.toString().length(), lessThan(15));

    }
@ParameterizedTest
@MethodSource("createMealsWithNameAndPrice")
void MealsShouldHaveCorrectNameAndPrice (String name,int price){
        assertThat(name, containsString("burger"));
        assertThat(price,greaterThanOrEqualTo(12));
}
    private static Stream<Arguments> createMealsWithNameAndPrice() {
        return Stream.of(
                Arguments.of("Hamburger", 14),
                Arguments.of("Cheeseburger", 16));
    }

    @ParameterizedTest
    @MethodSource("createCakeNames")
    void cakeNameShouldEndWithCake(String name){
        assertThat(name, containsString("cake"));
        assertThat(name, not(nullValue()));
    }
    private static Stream<String> createCakeNames(){
        List<String> cakes = Arrays.asList("cheesecake", "pancake", "fruitcake");
        return cakes.stream();
    }


}