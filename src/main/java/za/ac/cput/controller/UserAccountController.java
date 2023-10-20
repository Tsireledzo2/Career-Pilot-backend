package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.JobSeekerAccount;
import za.ac.cput.service.impl.UserAccountService;

import java.util.List;

@CrossOrigin(origins = " http://localhost:5000/")
@RestController
public class UserAccountController {

        @Autowired
        public UserAccountService userAccountService;
        @PostMapping("/createUser")
        public JobSeekerAccount create(@RequestBody JobSeekerAccount jobSeekerAccount){
            return userAccountService.create(jobSeekerAccount);
        }

        @GetMapping("/getUser/{userAccountID}")
        public JobSeekerAccount read(@PathVariable String userAccountID){
            return userAccountService.read(userAccountID);
        }

        @PostMapping("/updateUser")
        public JobSeekerAccount update(@RequestBody JobSeekerAccount jobSeekerAccount){
            return userAccountService.update(jobSeekerAccount);
        }

        @DeleteMapping("/deleteUser/{userAccountID}")
        public boolean delete(@PathVariable String userAccountID){
            return userAccountService.delete(userAccountID);
        }

        @GetMapping("/getAllUser")
        public List<JobSeekerAccount> getAll(){
            return userAccountService.getAll();
        }

        @GetMapping("/getUserByEmail/{userEmail}")
        public JobSeekerAccount readyEmail(@PathVariable String userEmail){
            return userAccountService.readByEmail(userEmail);
        }
}
