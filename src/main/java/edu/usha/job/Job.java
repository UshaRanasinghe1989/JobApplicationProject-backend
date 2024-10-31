package edu.usha.job;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Job {
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;
}
