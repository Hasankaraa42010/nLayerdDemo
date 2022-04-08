package businies.concretes;

import businies.abstracts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    private ProductDao productDao;
    private LoggerService loggerService;
    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId()==1){
            System.out.println("1 kategori ıd olanlar eklenemez:");
        return;
        }
        this.productDao.add(product);
        this.loggerService.loggedToDatabase("Urun eklendi:"+product.getName());
    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
