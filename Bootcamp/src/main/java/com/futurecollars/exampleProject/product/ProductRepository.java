package com.futurecollars.exampleProject.product;

public interface ProductRepository {
    Product[] getProductsByType(ProductType type);
}
