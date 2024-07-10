package com.wipro.wiproJobApplication.Dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JobRequestDto {

    public int id;
    @NotBlank(message = "Job title is mandatory")
    @NotNull(message = "Job title should not be null")
    @Size(min = 3, max = 50, message = "Job title should be between 3 and 50 characters")
    public  String jobTitle;
    @NotBlank(message = "Job description is mandatory")
    @NotNull(message = "Job description should not be null")
    @Size(min = 10, max = 500, message = "Job description should be between 10 and 500 characters")
    public  String jobDescription;
    @NotBlank(message = "Company is mandatory")
    @NotNull(message = "Company should not be null")
    public  String company;
    public  String location;
    public  String industry;
    public  String qualification;
    @Min(value = 0, message = "Experience must be non-negative")
    public  int experience;
    @Digits(integer = 10, fraction = 2, message = "Salary must be a non-negative number with up to two decimal places")
    public  double salary;
    @NotBlank(message = "Job type is mandatory")
    @Pattern(regexp = "FULLTIME|PARTTIME", message = "Job type must be FULLTIME or PARTTIME")
    public  String jobType;
    public  String contactInfo;
    public  String postedDate;
    public  String closingDate;
    public  String jobUrl;
    @NotBlank(message = "Job status is mandatory")
    @Pattern(regexp = "OPEN|CLOSED", message = "Job status must be OPEN or CLOSED")
    public  String jobStatus;
    public String designation;

}
