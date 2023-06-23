package domain.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    public void shouldAssertFalseWhenTwoCartsAreCompared(){
        Cart cart1 = new Cart(new ArrayList<>());
        Cart cart2 = new Cart(new ArrayList<>());
        Item item1 = new Item(new Product(new ProductId(1),new ProductName("Sony Wireless headphone")),new Quantity(1) );
        Item item2 = new Item(new Product(new ProductId(1),new ProductName("Sony Wireless headphone")),new Quantity(1) );
        cart1.addItem(item1);
        cart2.addItem(item2);

//        cart1.equals(cart2)  =>  should return false
        assertFalse(cart1.equals(cart2));
    }

}