package domain.model;

import domain.domain_service.OrderCreationFailedException;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public static Order create(Cart cart) {
        List<Product> products = new ArrayList<>();
        if (!cart.getItems().isEmpty()) {
            cart.getItems().forEach(item -> {
                for (int i = 0; i < item.getQty().value; i++) {
                    products.add(item.getProduct());
                }
            });
            cart.checkOut();
            return new Order(products);
        }
        throw new OrderCreationFailedException("Cart is empty");
    }
}
