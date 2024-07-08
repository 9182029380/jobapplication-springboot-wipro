package com.wipro.wiproJobApplication.repo;

import com.wipro.wiproJobApplication.model.Jobinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Jobrepo extends JpaRepository<Jobinfo,Integer> {
    List<Jobinfo> findByJobStatus(String jobStatus);
}
