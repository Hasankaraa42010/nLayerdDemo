import businies.abstracts.ProductService;
import businies.concretes.ProductManager;
import core.JloggerManagerAdapter;
import dataAccess.concretes.HibernateDao;
import entities.concretes.Product;
import jLogger.JLoggerManager;

public class Main {

    public static void main(String[] args) {
        Product product=new Product(2,12,"Elma",12,5);
        ProductService productService=new ProductManager(new HibernateDao(),new JloggerManagerAdapter());
        productService.add(product);
    }
}
