package iuh.fit.se.webbanhangthethao.Repository;

import iuh.fit.se.webbanhangthethao.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
