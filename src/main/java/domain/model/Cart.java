package domain.model;

import domain.model.Product;

import java.util.List;
import java.util.Map;

public class Cart {
//    List<Product> products;
    Map<Product,Integer> products;

    public Cart(Map<Product,Integer> products) {
        this.products = products;
    }

    public void addProduct(Product product,int qty) {
        products.put(product,qty);
    }

    public Map<Product,Integer> getProducts() {
        return products;
    }

}
