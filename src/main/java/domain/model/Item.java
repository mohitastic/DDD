package domain.model;

public class Item {
    Product product;
    Quantity qty;

    public Item(Product product, Quantity qty) {
        this.product = product;
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Quantity getQty() {
        return qty;
    }

    public void setQty(Quantity qty) {
        this.qty = qty;
    }
}
