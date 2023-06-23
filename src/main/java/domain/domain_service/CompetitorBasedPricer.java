package domain.domain_service;

import domain.model.Price;
import domain.model.Product;
import domain.model.ProductName;

import java.util.Collections;
import java.util.Currency;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CompetitorBasedPricer {
    private final Map<ProductName, List<Price>> productPriceMap;

    public CompetitorBasedPricer(Map<ProductName, List<Price>> productPriceMap) {
        this.productPriceMap = productPriceMap;
    }

    public Product getDiscountedProduct(Product product) {
        List<Price> priceList = productPriceMap.get(product.getName());
        List<Integer> list = priceList.stream().map(Price::getValue).collect(Collectors.toList());
        Integer minPrice = Collections.min(list);
        double discountedPrice = minPrice - (minPrice * 0.10);

        return new Product(product.getId(), product.getName(),
            new Price(Currency.getInstance("USD"), (int) discountedPrice));
    }
}
