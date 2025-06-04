package mini.project.track_mate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mini.project.track_mate.Entity.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long>{
    List<Expense> findByUserId(Long userId);
List<Expense> findByUserIdAndCategoryId(Long userId, Long categoryId);

}
