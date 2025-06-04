package mini.project.track_mate.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mini.project.track_mate.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String mail);
    
    
}
