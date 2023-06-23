package domain.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class OrderTest {

    @Test
    public void shouldCreateOrderSuccessfully() {
        Cart cart = new Cart(new ArrayList<>());
        Price price = new Price(Currency.getInstance("USD"), 20);
        Product product1 = new Product(new ProductId(1), new ProductName("Sony Wireless headphone"), price);
        Item item1 = new Item(product1,new Quantity(1));
        Product product2 = new Product(new ProductId(1), new ProductName("Apple Pencil"), price);
        Item item2 = new Item(product2, new Quantity(2));
        cart.addItem(item1);
        cart.addItem(item2);

        Order order = Order.create(cart);

        assertNotNull(order);
        assertEquals(order.getProducts().size(), 3);
        assertEquals(cart.getItems().size(), 0);
    }
}
