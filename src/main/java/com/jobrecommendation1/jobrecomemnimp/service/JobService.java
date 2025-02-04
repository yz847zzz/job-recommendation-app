package com.jobrecommendation1.jobrecomemnimp.service;

import com.jobrecommendation1.jobrecomemnimp.model.job;
import com.jobrecommendation1.jobrecomemnimp.repository.JobRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public job createJob(job job) {
        return jobRepository.save(job);
    }

    public List<job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Optional<job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    public List<job> searchJobs(String title, String location) {
        if (title != null && location != null) {
            return jobRepository.findByTitleContainingIgnoreCase(title);
        } else if (title != null) {
            return jobRepository.findByTitleContainingIgnoreCase(title);
        } else if (location != null) {
            return jobRepository.findByLocationContainingIgnoreCase(location);
        }
        return jobRepository.findAll();
    }

    public job updateJob(Long id, job jobDetails) {
        return jobRepository.findById(id).map(job -> {
            job.setTitle(jobDetails.getTitle());
            job.setDescription(jobDetails.getDescription());
            job.setCompany(jobDetails.getCompany());
            job.setLocation(jobDetails.getLocation());
            job.setSalary(jobDetails.getSalary());
            job.setJobType(jobDetails.getJobType());
            return jobRepository.save(job);
        }).orElseThrow(() -> new RuntimeException("Job not found"));
    }

    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }
}
