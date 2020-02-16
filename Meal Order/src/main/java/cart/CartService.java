package cart;

import order.OrderStatus;

public class CartService {
    private CartHandler cartHandler;

    public CartService(CartHandler cartHandler) {
        this.cartHandler = cartHandler;
    }

    public Cart processCart(Cart cart) {
        if (cartHandler.canHandlerCart(cart)) {
            cartHandler.sendToPrepare(cart);
            cart.getUserOrder().forEach(order -> order.changeOrderStatus(OrderStatus.PREPARING));
            return cart;
        } else {
            cart.getUserOrder().forEach(order -> order.changeOrderStatus(OrderStatus.REJECTED));
            return cart;
        }
    }
}
