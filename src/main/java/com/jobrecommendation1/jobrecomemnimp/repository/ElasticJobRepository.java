package com.jobrecommendation1.jobrecomemnimp.repository;

import com.jobrecommendation1.jobrecomemnimp.model.Job;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElasticJobRepository extends ElasticsearchRepository<Job, String> {
    List<Job> findByTitleContainingOrDescriptionContaining(String title, String description);
}
