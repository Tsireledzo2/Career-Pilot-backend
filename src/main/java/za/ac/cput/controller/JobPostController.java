package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.JobPost;

import za.ac.cput.service.impl.JobPostService;

import java.util.List;

@RestController
@RequestMapping("/JobPost")
@CrossOrigin
public class JobPostController {

    @Autowired
    private JobPostService jobPostService;

    @PostMapping("/create")
    public JobPost createUser (@RequestBody JobPost jobPost){
        return jobPostService.createJobPost(jobPost);
    }

    @GetMapping("/read/{id}")
    public JobPost read(@PathVariable Long id) {
        return jobPostService.readJobPost(id);
    }


    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Long id) {
        return jobPostService.delete(id);
    }

    @GetMapping("/getall")
    public List<JobPost> getAll() {
        return jobPostService.getAll();
    }
}
