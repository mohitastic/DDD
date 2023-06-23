import domain.model.*;
import domain.process.ShoppingService;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ShoppingServiceTest {

    @Test
    public void shouldAddApplePencilToCart(){
        Cart cart = new Cart(new ArrayList<>());
        ShoppingService shoppingService = new ShoppingService(cart);
        ProductId productId = new ProductId(1);
        ProductName applePencil = new ProductName("ApplePencil");
        Product product = new Product(productId, applePencil);

        shoppingService.add(new Item(product,new Quantity(1)));

        assertEquals(cart.getItems().size(),1);
    }

    @Test
    public void shouldAddSonyWirelessHeadphonesToCart(){
        Cart cart = new Cart(new ArrayList<>());
        ShoppingService shoppingService = new ShoppingService(cart);
        ProductId productId = new ProductId(1);
        ProductName applePencil = new ProductName("SonyWirelessHeadphones");
        Product product = new Product(productId, applePencil);

        shoppingService.add(new Item(product,new Quantity(1)));

        assertEquals(cart.getItems().size(),1);
    }

    @Test
    public void shouldAddTwoProductsToCart(){
        Cart cart = new Cart(new ArrayList<>());
        ShoppingService shoppingService = new ShoppingService(cart);
        ProductId productId = new ProductId(1);
        ProductName applePencil = new ProductName("SonyWirelessHeadphones");
        Product product = new Product(productId, applePencil);

        shoppingService.add(new Item(product,new Quantity(2)));

        assertEquals(cart.getItems().size(),1);
        assertEquals(cart.getItems().get(0).getProduct(),product);
    }

    @Test
    public void shouldRemoveProductFromCart(){
        Cart cart = new Cart(new ArrayList<>());
        ShoppingService shoppingService = new ShoppingService(cart);
        ProductId productId = new ProductId(1);
        ProductName productName = new ProductName("SonyWirelessHeadphones");
        Product product = new Product(productId, productName);

        shoppingService.add(new Item(product,new Quantity(2)));

        assertEquals(cart.getItems().size(),1);
        assertEquals(cart.getItems().get(0).getProduct(),product);

        shoppingService.remove(product);

        assertEquals(cart.getItems().size(),0);
    }

    @Test
    public void shouldAssertFalseWhenTwoCartsAreCompared(){
        Cart cart1 = new Cart(new ArrayList<>());
        Cart cart2 = new Cart(new ArrayList<>());
        Item item1 = new Item(new Product(new ProductId(1),new ProductName("Sony Wireless headphone")),new Quantity(1) );
        Item item2 = new Item(new Product(new ProductId(1),new ProductName("Sony Wireless headphone")),new Quantity(1) );
        cart1.addItem(item1);
        cart2.addItem(item2);

        assertNotEquals(cart1, cart2);
    }

}
