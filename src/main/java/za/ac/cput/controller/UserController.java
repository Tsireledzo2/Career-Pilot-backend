package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.User;
import za.ac.cput.service.impl.Userservice;

import java.util.List;

@RestController
@RequestMapping("/User")
@CrossOrigin
public class UserController {

    @Autowired
    private Userservice userService;

    @PostMapping("/create")
    public User createUser (@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/read/{id}")
    public User read(@PathVariable Long id) {
        return userService.read(id);
    }

    @PostMapping("/update")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Long id) {
        return userService.delete(id);
    }

    @GetMapping("/getall")
    public List<User> getAll() {
        return userService.getAll();
    }
}
