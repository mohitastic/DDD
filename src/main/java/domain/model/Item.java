package domain.model;

public class Item {
    Product product;
    Quantity qty;

    public Item(Product product, Quantity qty) {
        this.product = product;
        this.qty = qty;
    }
}
