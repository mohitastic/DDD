package domain.model;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Cart {
//    List<Product> products;
    Map<Product,Integer> products;
    List<Item> items;

    public Cart(Map<Product,Integer> products) {
        this.products = products;
    }

    public void addItem(Product product, int qty) {
        Item item = new Item(product, new Quantity(qty));
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void removeItem(Product product) {
        items.stream().reduce((item) -> (item.product.name.equals(product.name)).collect(Collections.toList());
        items.add(item);
    }

}
