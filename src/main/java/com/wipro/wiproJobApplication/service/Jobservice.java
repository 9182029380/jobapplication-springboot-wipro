package com.wipro.wiproJobApplication.service;

import com.wipro.wiproJobApplication.Dto.JobRequestDto;
import com.wipro.wiproJobApplication.model.Jobinfo;
import com.wipro.wiproJobApplication.repo.Jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class Jobservice {
    @Autowired
    private Jobrepo repo;
    public Jobinfo addJob(JobRequestDto job) {
        Jobinfo jobinfo = Jobinfo.builder()
                .id(job.getId())
                .jobTitle(job.getJobTitle())
                .jobDescription(job.getJobDescription())
                .company(job.getCompany())
                .location(job.getLocation())
                .industry(job.getIndustry())
                .postedDate(job.getPostedDate())
                .qualification(job.getQualification())
                .experience(job.getExperience())
                .salary(job.getSalary())
                .jobType(job.getJobType())
                .jobStatus(job.getJobStatus())
                .jobUrl(job.getJobUrl())
                .contactInfo(job.getContactInfo())
                .designation(job.getDesignation())
                .closingDate(job.getClosingDate())
                .build();

        return repo.save(jobinfo);
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


    public Jobinfo updateJob(int id, Jobinfo job) {
        Optional<Jobinfo> existingjobInfo = repo.findById(id);
        if (existingjobInfo.isPresent()) {
            Jobinfo updatedJob = existingjobInfo.get();
            updatedJob.setJobTitle(job.getJobTitle());
            updatedJob.setJobDescription(job.getJobDescription());
            updatedJob.setJobStatus(job.getJobStatus());
            return repo.save(updatedJob);
        } else {
            return null;
        }
    }

    public String deleteJob(int id) {
        repo.deleteById(id);
        return "success delete job " + id;
    }
}
