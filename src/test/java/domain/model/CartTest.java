package domain.model;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Currency;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class CartTest {

    @Test
    public void shouldAssertFalseWhenTwoCartsAreCompared(){
        Cart cart1 = new Cart(new ArrayList<>());
        Cart cart2 = new Cart(new ArrayList<>());
        Price price = new Price(Currency.getInstance("USD"), 20);
        Item item1 = new Item(new Product(new ProductId(1),new ProductName("Sony Wireless headphone"), price),new Quantity(1) );
        Item item2 = new Item(new Product(new ProductId(1),new ProductName("Sony Wireless headphone"), price),new Quantity(1) );
        cart1.addItem(item1);
        cart2.addItem(item2);

        assertFalse(cart1.equals(cart2));
    }

    @Test
    public void shouldEmptyItemListWhenCheckedOut() {
        Cart cart = new Cart(new ArrayList<>());
        Price price = new Price(Currency.getInstance("USD"), 20);
        Item item1 = new Item(new Product(new ProductId(1),new ProductName("Sony Wireless headphone"), price),new Quantity(1) );
        Item item2 = new Item(new Product(new ProductId(1),new ProductName("Sony Wireless headphone"), price),new Quantity(1) );
        cart.addItem(item1);
        cart.addItem(item2);

        assertEquals(cart.getItems().size(), 2);

        cart.checkOut();

        assertEquals(cart.getItems().size(), 0);
    }
}