package repositories;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.User;

@Repository
public interface UserRepository extends JpaRepository <User,Long> {
    Page<User> findAll(Pageable pageable);
    
    User getById(Long id);
    

}
