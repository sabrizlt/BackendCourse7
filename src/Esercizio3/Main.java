package Esercizio3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Boys", 120));
        productList.add(new Product("Girls", 80));
        productList.add(new Product("Boys", 200));
        productList.add(new Product("Boys", 150));

        
        List<Product> discountProducts = productList.stream()
                .filter(product -> product.getCategory().equals("Boys"))
                .map(product -> {
                    double discountedPrice = product.getPrice() * 0.9; 
                    product.setPrice(discountedPrice);
                    return product;
                })
                .collect(Collectors.toList());

        for (Product product : discountProducts) {
            System.out.println("Categoria: " + product.getCategory() + ", Prezzo scontato: " + product.getPrice());
        }
    }
}

