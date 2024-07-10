package com.wipro.wiproJobApplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jobinfo")
@Builder
public class Jobinfo {
    @Id  //Pk
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public  String jobTitle;
    public  String jobDescription;
    public  String company;
    public  String location;
    public  String industry;
    public  String qualification;
    public  int experience;
    public  double salary;
    public  String jobType;
    public  String contactInfo;
    public  String postedDate;
    public  String closingDate;
    public  String jobUrl;
    public  String jobStatus;
    public String designation;


}
