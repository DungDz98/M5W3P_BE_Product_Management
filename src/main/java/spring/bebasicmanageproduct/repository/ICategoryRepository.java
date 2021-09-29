package spring.bebasicmanageproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.bebasicmanageproduct.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
