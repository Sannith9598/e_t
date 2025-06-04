package mini.project.track_mate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mini.project.track_mate.Entity.Alert;

@Repository
public interface AlertRepository extends JpaRepository<Alert,Long> {
    List<Alert> findByUserId(Long userId);
}
