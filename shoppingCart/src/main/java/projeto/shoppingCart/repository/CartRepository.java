package projeto.shoppingCart.repository;

import org.springframework.data.repository.CrudRepository;
import projeto.shoppingCart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
