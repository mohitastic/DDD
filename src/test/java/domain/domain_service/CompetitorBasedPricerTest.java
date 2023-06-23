package domain.domain_service;

import domain.model.Price;
import domain.model.Product;
import domain.model.ProductId;
import domain.model.ProductName;
import org.junit.Test;

import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CompetitorBasedPricerTest {

    @Test
    public void shouldReturnDiscountedPriceForProduct() {
        ProductName productName = new ProductName("Pdt");
        Map<ProductName, List<Price>> productPriceMap = new HashMap<>();
        Currency usd = Currency.getInstance("USD");
        productPriceMap.put(productName, List.of(new Price(usd, 100), new Price(usd, 200)));
        CompetitorBasedPricer competitorBasedPricer = new CompetitorBasedPricer(productPriceMap);
        Product product = new Product(new ProductId(1), productName, null);

        Product discountedProduct = competitorBasedPricer.getDiscountedProduct(product);

        assertEquals(discountedProduct.getPrice().getValue().intValue(), 90);
    }
}
