package mini.project.track_mate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mini.project.track_mate.Entity.Category;
@Repository

public interface CategoryRepository extends JpaRepository<Category,Long>{
    
}
