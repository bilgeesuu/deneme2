package deneme2.deneme2.repository;

import deneme2.deneme2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
        }
