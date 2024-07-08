package com.wipro.wiproJobApplication.service;

import com.wipro.wiproJobApplication.model.Jobinfo;
import com.wipro.wiproJobApplication.repo.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Jobservice {
    @Autowired
    private Jobrepo repo;
    public Jobinfo addJob(Jobinfo job) {
        return repo.save(job);
    }

    public List<Jobinfo> getAllJobs() {
        return repo.findAll();
    }

    public Jobinfo getJobById(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<Jobinfo> getJobsByStatus(String jobStatus) {
        return repo.findByJobStatus(jobStatus);
    }

    public List<Jobinfo> addJobs(List<Jobinfo> jobs) {
        return repo.saveAll(jobs);
    }
}
