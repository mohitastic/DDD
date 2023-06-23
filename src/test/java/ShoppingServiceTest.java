import domain.model.Cart;
import domain.model.Product;
import domain.model.ProductId;
import domain.model.ProductName;
import domain.process.ShoppingService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingServiceTest {

    @Test
    public void shouldAddApplePencilToCart(){
        Cart cart = new Cart(new HashMap<>());
        ShoppingService shoppingService = new ShoppingService(cart);
        ProductId productId = new ProductId(1);
        ProductName applePencil = new ProductName("ApplePencil");
        Product product = new Product(productId, applePencil);

        shoppingService.add(product,1);

        assertEquals(cart.getProducts().size(),1);
    }

    @Test
    public void shouldAddSonyWirelessHeadphonesToCart(){
        Cart cart = new Cart(new HashMap<>());
        ShoppingService shoppingService = new ShoppingService(cart);
        ProductId productId = new ProductId(1);
        ProductName applePencil = new ProductName("SonyWirelessHeadphones");
        Product product = new Product(productId, applePencil);

        shoppingService.add(product,1);

        assertEquals(cart.getProducts().size(),1);
    }

    @Test
    public void shouldAddTwoProductsToCart(){
        Cart cart = new Cart(new HashMap<>());
        ShoppingService shoppingService = new ShoppingService(cart);
        ProductId productId = new ProductId(1);
        ProductName applePencil = new ProductName("SonyWirelessHeadphones");
        Product product = new Product(productId, applePencil);

        shoppingService.add(product,2);

        assertEquals(cart.getProducts().size(),1);
        assertTrue(cart.getProducts().containsKey(product));
        assertTrue(cart.getProducts().containsValue(2));
    }


}
