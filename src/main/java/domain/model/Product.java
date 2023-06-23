package domain.model;

public class Product {
    ProductId id;
    ProductName name;

    public Product(ProductId id, ProductName name) {
        this.id = id;
        this.name = name;
    }

}
