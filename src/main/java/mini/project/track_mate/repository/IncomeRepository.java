package mini.project.track_mate.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import mini.project.track_mate.Entity.Income;

public interface IncomeRepository  extends JpaRepository<Income, Long> {
    
}
