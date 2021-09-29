package spring.bebasicmanageproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.bebasicmanageproduct.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
}
