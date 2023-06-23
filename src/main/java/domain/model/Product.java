package domain.model;

public class Product {
    ProductId id;
    ProductName name;

    Price price;

    public Product(ProductId id, ProductName name, Price price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}
