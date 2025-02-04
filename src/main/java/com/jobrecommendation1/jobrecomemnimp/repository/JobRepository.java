package com.jobrecommendation1.jobrecomemnimp.repository;

import com.jobrecommendation1.jobrecomemnimp.model.job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<job, Long> {
    List<job> findByTitleContainingIgnoreCase(String title);
    List<job> findByLocationContainingIgnoreCase(String location);
}
