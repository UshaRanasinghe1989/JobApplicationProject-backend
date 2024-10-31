package edu.usha.job;

import java.util.Optional;

public interface JobService {
    Optional<Job> save(Job job);
}
