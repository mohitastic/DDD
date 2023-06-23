package domain.domain_service;

import domain.model.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Currency;

import static org.junit.Assert.assertEquals;

public class ShoppingServiceTest {

    @Test
    public void shouldAddApplePencilToCart(){
        Cart cart = new Cart(new ArrayList<>());
        ShoppingService shoppingService = new ShoppingService(cart);
        ProductId productId = new ProductId(1);
        ProductName applePencil = new ProductName("ApplePencil");
        Price price = new Price(Currency.getInstance("USD"), 20);
        Product product = new Product(productId, applePencil, price);

        shoppingService.add(new Item(product, new Quantity(1)));

        assertEquals(cart.getItems().size(),1);
    }

    @Test
    public void shouldAddSonyWirelessHeadphonesToCart(){
        Cart cart = new Cart(new ArrayList<>());
        ShoppingService shoppingService = new ShoppingService(cart);
        ProductId productId = new ProductId(1);
        ProductName applePencil = new ProductName("SonyWirelessHeadphones");
        Price price = new Price(Currency.getInstance("USD"), 20);
        Product product = new Product(productId, applePencil, price);

        shoppingService.add(new Item(product, new Quantity(1)));

        assertEquals(cart.getItems().size(),1);
    }

    @Test
    public void shouldAddTwoProductsToCart(){
        Cart cart = new Cart(new ArrayList<>());
        ShoppingService shoppingService = new ShoppingService(cart);
        ProductId productId = new ProductId(1);
        ProductName applePencil = new ProductName("SonyWirelessHeadphones");
        Price price = new Price(Currency.getInstance("USD"), 20);
        Product product = new Product(productId, applePencil, price);

        shoppingService.add(new Item(product, new Quantity(2)));

        assertEquals(cart.getItems().size(),1);
        assertEquals(cart.getItems().get(0).getProduct(),product);
    }

    @Test
    public void shouldRemoveProductFromCart(){
        Cart cart = new Cart(new ArrayList<>());
        ShoppingService shoppingService = new ShoppingService(cart);
        ProductId productId = new ProductId(1);
        ProductName productName = new ProductName("SonyWirelessHeadphones");
        Price price = new Price(Currency.getInstance("USD"), 20);
        Product product = new Product(productId, productName, price);

        shoppingService.add(new Item(product, new Quantity(2)));

        assertEquals(cart.getItems().size(),1);
        assertEquals(cart.getItems().get(0).getProduct(),product);

        shoppingService.remove(product);

        assertEquals(cart.getItems().size(),0);
    }

}
