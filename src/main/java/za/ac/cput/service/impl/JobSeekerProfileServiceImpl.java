//package za.ac.cput.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.domain.JobSeekerProfile;
//import za.ac.cput.repository.JobSeekerProfileRepository;
//import za.ac.cput.service.JobSeekerProfileService;
//
//import java.util.List;
//
//@Service
//public class JobSeekerProfileServiceImpl implements JobSeekerProfileService {
//
//    @Autowired
//    private JobSeekerProfileRepository jobSeekerProfileRepository;
//
//    @Override
//    public JobSeekerProfile saveJobSeekerProfile(JobSeekerProfile jobSeekerProfile) {
//        return jobSeekerProfileRepository.save(jobSeekerProfile);
//    }
//
//
//    @Override
//    public List<JobSeekerProfile> getAll() {
//        return this.jobSeekerProfileRepository.findAll();
//    }
//
//
//}
//
