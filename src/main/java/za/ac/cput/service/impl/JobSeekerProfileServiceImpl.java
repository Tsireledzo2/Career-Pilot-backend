//package za.ac.cput.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import za.ac.cput.domain.JobSeekerProfile;
//import za.ac.cput.repository.JobSeekerProfileRepository;
//import za.ac.cput.service.JobSeekerProfileService;
//
//@Service
//public class JobSeekerProfileServiceImpl implements JobSeekerProfileService {
//
//    private JobSeekerProfileRepository jobSeekerProfileRepository;
//
//    @Autowired
//    private JobSeekerProfileServiceImpl(JobSeekerProfileRepository jobSeekerProfileRepository) {
//        this.jobSeekerProfileRepository = jobSeekerProfileRepository;
//    }
//
//    @Override
//    public JobSeekerProfile create(JobSeekerProfile jobSeekerProfile) {
//        System.out.println(jobSeekerProfile);
//        return jobSeekerProfileRepository.save(jobSeekerProfile);
//    }
//
//    @Override
//    public JobSeekerProfile read(String jobSeekerEmail) {
//        return jobSeekerProfileRepository.findById(jobSeekerEmail).orElse(null);
//    }
//
//    @Override
//    public JobSeekerProfile update(JobSeekerProfile jobSeekerProfile) {
//        return null;
//    }
//
//    @Override
//    public boolean delete(String s) {
//        return false;
//    }
//}
//
