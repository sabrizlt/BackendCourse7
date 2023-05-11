package Esercizio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Books", 120));
        productList.add(new Product("Books", 80));
        productList.add(new Product("Electronics", 150));
        productList.add(new Product("Books", 200));
        productList.add(new Product("Food", 25));
        productList.add(new Product("Toys", 99));
        productList.add(new Product("Home", 1150));
        productList.add(new Product("Books", 100));
        productList.add(new Product("Books", 101));

        List<Product> filteredProducts = productList.stream()
                .filter(product -> product.getCategory().equals("Books"))
                .filter(product -> product.getPrice() > 100)
                .collect(Collectors.toList());

        for (Product product : filteredProducts) {
            System.out.println("Categoria: " + product.getCategory() + ", Prezzo: " + product.getPrice());
        }
    }
}
