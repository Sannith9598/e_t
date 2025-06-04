package mini.project.track_mate.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import mini.project.track_mate.Entity.Income;

public interface IncomeRepository  extends JpaRepository<Income, Long> {
    List<Income> findByUserId(Long userId);

}
