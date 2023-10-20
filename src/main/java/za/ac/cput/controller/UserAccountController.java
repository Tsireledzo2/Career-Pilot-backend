package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.UserAccount;
import za.ac.cput.service.impl.UserAccountService;

import java.util.List;

@CrossOrigin(origins = " http://localhost:5000/")
@RestController
public class UserAccountController {

        @Autowired
        public UserAccountService userAccountService;
        @PostMapping("/createUser")
        public UserAccount create(@RequestBody UserAccount userAccount){
            return userAccountService.create(userAccount);
        }

        @GetMapping("/getUser/{userAccountID}")
        public UserAccount read(@PathVariable String userAccountID){
            return userAccountService.read(userAccountID);
        }

        @PostMapping("/updateUser")
        public UserAccount update(@RequestBody UserAccount userAccount){
            return userAccountService.update(userAccount);
        }

        @DeleteMapping("/deleteUser/{userAccountID}")
        public boolean delete(@PathVariable String userAccountID){
            return userAccountService.delete(userAccountID);
        }

        @GetMapping("/getAllUser")
        public List<UserAccount> getAll(){
            return userAccountService.getAll();
        }

        @GetMapping("/getUserByEmail/{userEmail}")
        public UserAccount readyEmail(@PathVariable String userEmail){
            return userAccountService.readByEmail(userEmail);
        }
}
