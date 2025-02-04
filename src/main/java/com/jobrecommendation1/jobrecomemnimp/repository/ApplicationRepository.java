package com.jobrecommendation1.jobrecomemnimp.repository;

import com.jobrecommendation1.jobrecomemnimp.model.Application;
import com.jobrecommendation1.jobrecomemnimp.model.Job;
import com.jobrecommendation1.jobrecomemnimp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    List<Application> findByUser(User user);
    List<Application> findByJob(Job job);
    Optional<Application> findByJobAndUser(Job job, User user);
}
