package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.User;
import za.ac.cput.repository.Userrepo;

import java.util.List;

@Service
public class Userservice {

    private final Userrepo repository ;

    @Autowired
    public Userservice(Userrepo repository){

        this.repository = repository;
    }


    public User createUser(User user) {
        return this.repository.save(user);
    }

    public User read(Long aLong) {
        return this.repository.findById(aLong).orElse(null);
    }


    public User update(User user) {
        return
                this.repository.save(user);
    }


    public boolean delete(Long aLong) {
        if(this.repository.existsById(aLong)){
            this.repository.deleteById(aLong);
            return true;
        }
        return false;
    }


    public List<User> getAll() {
        return this.repository.findAll();
    }

}