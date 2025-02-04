package com.jobrecommendation1.jobrecomemnimp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;

@Document(indexName = "jobs")
public class Job {

    @Id
    private String id;

    @Field(type = FieldType.Text)
    private String title;

    @Field(type = FieldType.Text)
    private String description;

    @Field(type = FieldType.Keyword)
    private String company;

    @Field(type = FieldType.Keyword)
    private String location;

    @Field(type = FieldType.Double)
    private double salary;

    @Field(type = FieldType.Keyword)
    private JobType jobType;

    @Field(type = FieldType.Date)
    private LocalDateTime postedAt;

    public Job() {}

    public Job(String title, String description, String company, String location, double salary, JobType jobType) {
        this.title = title;
        this.description = description;
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.jobType = jobType;
        this.postedAt = LocalDateTime.now();
    }

    // ✅ Getters and Setters
}
