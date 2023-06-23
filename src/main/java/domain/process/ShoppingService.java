package domain.process;

import domain.model.Cart;
import domain.model.Product;
import domain.model.ProductName;

public class ShoppingService {

    private Cart cart;

    public ShoppingService(Cart cart) {
        this.cart = cart;
    }

//    public void add(Product product,int qty) {
//        cart.addItem(product,qty);
//    }

    public void remove(Product product) {
        cart.removeItem(product);
    }
}
