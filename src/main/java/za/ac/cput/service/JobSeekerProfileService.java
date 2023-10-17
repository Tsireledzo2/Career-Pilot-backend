package za.ac.cput.service;

import za.ac.cput.domain.JobSeekerProfile;

import java.util.List;

public interface JobSeekerProfileService {

    public JobSeekerProfile saveJobSeekerProfile(JobSeekerProfile jobSeekerProfile);

    public List<JobSeekerProfile> getAll();



}
