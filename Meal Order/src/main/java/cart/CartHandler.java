package cart;

public interface CartHandler {
    public boolean canHandlerCart(Cart cart);
    public void sendToPrepare(Cart cart);
}
