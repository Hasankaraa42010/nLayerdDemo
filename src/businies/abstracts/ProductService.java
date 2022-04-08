package businies.abstracts;

import entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    void delete(Product product);
    void update(Product product);
    List<Product> getAll();

}
