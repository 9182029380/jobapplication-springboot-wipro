package com.wipro.wiproJobApplication.controller;

import com.wipro.wiproJobApplication.Dto.JobRequestDto;
import com.wipro.wiproJobApplication.exceptions.JobNotFoundException;
import com.wipro.wiproJobApplication.model.Jobinfo;

import com.wipro.wiproJobApplication.service.Jobservice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/wipro")
public class JobController {
    @Autowired
    private Jobservice jobService;

    @PostMapping("/addjob")
    public ResponseEntity<Jobinfo> addJob(@RequestBody @Valid JobRequestDto jobdto) {
        return new ResponseEntity<>(jobService.addJob(jobdto), HttpStatus.CREATED);
    }
    @PostMapping("/addjobs")
    public List<Jobinfo> addJobs(@RequestBody List<Jobinfo> jobs) {
        return jobService.addJobs(jobs);
    }
    @GetMapping("/jobs")
    public List<Jobinfo> getAllJobs() {
        return jobService.getAllJobs();
    }
    @GetMapping("/job/{id}")
    public Optional<Jobinfo> getJobById(@PathVariable int id) throws JobNotFoundException {
        return jobService.getJobById(id);
    }
    @GetMapping("/status/{jobStatus}")
    public List<Jobinfo> getJobsByStatus(@PathVariable String jobStatus) {
        return jobService.getJobsByStatus(jobStatus);
    }

    @PutMapping("/update/{id}")
    public Jobinfo updateJob(@PathVariable int id, @RequestBody Jobinfo job) {
        return jobService.updateJob(id,job);
    }
    @DeleteMapping("/delete/{id}")
    public String  deleteJob(@PathVariable int id) {
        return jobService.deleteJob(id);
    }



}
