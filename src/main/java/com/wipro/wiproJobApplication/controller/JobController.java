package com.wipro.wiproJobApplication.controller;

import com.wipro.wiproJobApplication.model.Jobinfo;

import com.wipro.wiproJobApplication.service.Jobservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wipro")
public class JobController {
    @Autowired
    private Jobservice jobService;

    @PostMapping("/addjob")
    public Jobinfo addJob(@RequestBody Jobinfo job) {
        return jobService.addJob(job);
    }
}
