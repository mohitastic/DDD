package domain.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items;

    public Cart(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
//        Item item = new Item(product, new Quantity(qty));
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public Item removeItem(Product product) {
        List<Item> removedItems = new ArrayList<>();
        items.removeIf(item -> {
            if (item.product.name.equals(product.name)) {
                removedItems.add(item);
                return true;
            }
            return false;
        });
        return removedItems.stream().findFirst().orElse(null);
    }

}
