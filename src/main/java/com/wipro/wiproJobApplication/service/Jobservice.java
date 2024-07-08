package com.wipro.wiproJobApplication.service;

import com.wipro.wiproJobApplication.model.Jobinfo;
import com.wipro.wiproJobApplication.repo.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Jobservice {
    @Autowired
    private Jobrepo repo;
    public Jobinfo addJob(Jobinfo job) {
        return repo.save(job);
    }
}
