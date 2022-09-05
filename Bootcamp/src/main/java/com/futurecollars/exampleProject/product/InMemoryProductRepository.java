package com.futurecollars.exampleProject.product;

public class InMemoryProductRepository implements  ProductRepository{

    private static final Product[] PRODUCTS = {
            new Product("Ser",10.0, ProductType.DAIRY),
            new Product("Mleko",5.3, ProductType.DAIRY),
            new Product("Vizir",23.5, ProductType.CHEMICAL),
            new Product("Płyn do naczyń",8.0, ProductType.CHEMICAL),
            new Product("Whisky",60.0, ProductType.ALCOHOL),
            new Product("Piwo",4.0, ProductType.ALCOHOL),
            new Product("Burbon",90.0, ProductType.ALCOHOL),
    };

    @Override
    public Product[] getProductsByType(ProductType type) {
        Product[] productsToReturn = new Product[100];
        int i=0;
        for (Product x : PRODUCTS){
            if(x.getType()==type){
                productsToReturn[i] = x;
                i++;
            }
        }
        return productsToReturn;
    }
}
