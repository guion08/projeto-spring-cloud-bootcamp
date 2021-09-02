package projeto.productCatalog.repository;

import org.springframework.data.repository.CrudRepository;
import projeto.productCatalog.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
