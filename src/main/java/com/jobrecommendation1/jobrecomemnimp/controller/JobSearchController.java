package com.jobrecommendation1.jobrecomemnimp.controller;

import com.jobrecommendation1.jobrecomemnimp.model.Job;
import com.jobrecommendation1.jobrecomemnimp.service.JobSearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs/search")
public class JobSearchController {

    private final JobSearchService jobSearchService;

    public JobSearchController(JobSearchService jobSearchService) {
        this.jobSearchService = jobSearchService;
    }

    @GetMapping
    public ResponseEntity<List<Job>> searchJobs(@RequestParam String keyword) {
        return ResponseEntity.ok(jobSearchService.searchJobs(keyword));
    }

    @PostMapping
    public ResponseEntity<Job> indexJob(@RequestBody Job job) {
        return ResponseEntity.ok(jobSearchService.saveJob(job));
    }
}
