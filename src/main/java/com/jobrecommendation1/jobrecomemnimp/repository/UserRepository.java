package com.jobrecommendation1.jobrecomemnimp.repository;

import com.jobrecommendation1.jobrecomemnimp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); // Ensure it returns Optional<User>
}
