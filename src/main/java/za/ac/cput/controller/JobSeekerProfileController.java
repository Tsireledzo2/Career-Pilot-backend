//package za.ac.cput.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import za.ac.cput.domain.JobSeekerProfile;
//import za.ac.cput.service.impl.JobSeekerProfileServiceImpl;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/jobSeekerProfile")
//@CrossOrigin
//public class JobSeekerProfileController {
//
//    @Autowired
//    private JobSeekerProfileServiceImpl jobSeekerProfileService;
//
//    @PostMapping("/add")
//    public JobSeekerProfile add(@RequestBody JobSeekerProfile jobSeekerProfile){
//        return jobSeekerProfileService.create(jobSeekerProfile);
//    }
//
//    @GetMapping("/getJobSeeker/{email}")
//    public JobSeekerProfile getJobSeeker(@PathVariable String email) {
//        return jobSeekerProfileService.read(email);
//    }
//
////    @GetMapping("/getAll")
////    public List<JobSeekerProfile> getAllJobSeekers(){
////        return jobSeekerProfileService.getAll();
////    }
//}
