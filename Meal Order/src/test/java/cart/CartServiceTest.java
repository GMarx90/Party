package cart;

import order.Order;
import order.OrderStatus;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.in;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

class CartServiceTest {
    @Test
    void processCartShouldSentToPrepare()
    {
        Order order=new Order();
        Cart cart=new Cart();
        cart.addOrderToCart(order);
        CartHandler cartHandler=mock(CartHandler.class);
        CartService cartService=new CartService(cartHandler);
        given(cartHandler.canHandlerCart(cart)).willReturn(true);

        //when
        Cart resultCart= cartService.processCart(cart);

 //       verify(cartHandler).sendToPrepare(cart);
        assertThat(resultCart
                .getUserOrder()
                .get(0)
                .getOrderStatus(),
                equalTo(OrderStatus.PREPARING));
        InOrder inOrder= Mockito.inOrder(cartHandler);
    inOrder.verify(cartHandler).canHandlerCart(cart);
    inOrder.verify(cartHandler).sendToPrepare(cart);
    }
  @Test
    void processCartShouldNotSentToPrepare()
    {
        Order order=new Order();
        Cart cart=new Cart();
        cart.addOrderToCart(order);
        CartHandler cartHandler=mock(CartHandler.class);
        CartService cartService=new CartService(cartHandler);
   //     given(cartHandler.canHandlerCart(cart)).willReturn(false);
        given(cartHandler.canHandlerCart(any(Cart.class))).willReturn(false);

        //when
        Cart resultCart= cartService.processCart(cart);
        verify(cartHandler, never()).sendToPrepare(cart);
        assertThat(resultCart
                .getUserOrder()
                .get(0)
                .getOrderStatus(),
                equalTo(OrderStatus.REJECTED));
//        InOrder inOrder= Mockito.inOrder(cartHandler);
//    inOrder.verify(cartHandler).canHandlerCart(cart);
//    inOrder.verify(cartHandler).sendToPrepare(cart);
    }

}