package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.JobPost;
import za.ac.cput.domain.User;
import za.ac.cput.repository.JobPostRepo;

import java.util.List;

@Service
public class JobPostService {
    private final JobPostRepo repository;

    @Autowired
    public JobPostService(JobPostRepo repository) {
        this.repository = repository;
    }

    public JobPost createJobPost(JobPost jobPost) {
        return this.repository.save(jobPost);
    }

    public JobPost readJobPost(Long aLong) {
        return this.repository.findById(aLong).orElse(null);
    }

    public boolean delete(Long aLong) {
        if(this.repository.existsById(aLong)){
            this.repository.deleteById(aLong);
            return true;
        }
        return false;
    }

    public List<JobPost> getAll() {
        return this.repository.findAll();
    }
}
