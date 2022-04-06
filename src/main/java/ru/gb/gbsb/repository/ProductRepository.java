package ru.gb.gbsb.repository;

import org.springframework.stereotype.Component;
import ru.gb.gbsb.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component("ProductRepository")
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    private int count;

    public List<Product> findAllList() {
        return new ArrayList<>(products);
    }

    public Optional<Product> findById(Integer id) {
        if (id < (products.size()) && id >= 0) {
            return Optional.of(products.get(id));
        } else {
            return Optional.empty();
        }

    }

    public Product save(Product product) {
        product.setId(count++);
        products.add(product);
        return Product.builder()
                .id(product.getId())
                .title(product.getTitle())
                .cost(product.getCost())
                .build();
    }

    public void add(Product product) {
        products.add(product);
    }

    public Product getRandomProduct() {
        return Product.builder()
                .id(getRandomProduct().getId())
                .title("Randomizer")
                .cost(5602d)
                .build();
    }
}
