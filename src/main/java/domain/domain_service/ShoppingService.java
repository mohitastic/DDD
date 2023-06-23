package domain.domain_service;

import domain.model.Cart;
import domain.model.Item;
import domain.model.Product;

public class ShoppingService {

    private Cart cart;

    public ShoppingService(Cart cart) {
        this.cart = cart;
    }

    public void add(Item item) {
        cart.addItem(item);
    }

    public void remove(Product product) {
        cart.removeItem(product);
    }
}
