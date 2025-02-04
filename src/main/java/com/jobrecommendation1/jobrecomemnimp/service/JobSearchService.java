package com.jobrecommendation1.jobrecomemnimp.service;

import com.jobrecommendation1.jobrecomemnimp.model.Job;
import com.jobrecommendation1.jobrecomemnimp.repository.ElasticJobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSearchService {

    private final ElasticJobRepository elasticJobRepository;

    public JobSearchService(ElasticJobRepository elasticJobRepository) {
        this.elasticJobRepository = elasticJobRepository;
    }

    public List<Job> searchJobs(String keyword) {
        return elasticJobRepository.findByTitleContainingOrDescriptionContaining(keyword, keyword);
    }

    public Job saveJob(Job job) {
        return elasticJobRepository.save(job);
    }
}
