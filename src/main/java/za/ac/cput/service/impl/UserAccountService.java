package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.JobSeekerAccount;
import za.ac.cput.repository.IUserAccountRepository;
import za.ac.cput.service.IUserAccountService;

import java.util.List;

@Service
public class UserAccountService implements IUserAccountService {
    private IUserAccountRepository userAccountRepository;

    @Autowired
    private UserAccountService(IUserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }


    @Override
    public JobSeekerAccount create(JobSeekerAccount jobSeekerAccount) {
        return userAccountRepository.save(jobSeekerAccount);
    }

    @Override
    public JobSeekerAccount read(String email) {
        return userAccountRepository.findById(email).orElse(null);
    }

    @Override
    public JobSeekerAccount update(JobSeekerAccount jobSeekerAccount) {
        if(this.userAccountRepository.existsById(jobSeekerAccount.getEmail()))
            return this.userAccountRepository.save(jobSeekerAccount);
        return null;
    }

    @Override
    public boolean delete(String userAccount) {
        if(this.userAccountRepository.existsById(userAccount)) {
            this.userAccountRepository.deleteById(userAccount);
            return true;
        }
        return false;
    }

    @Override
    public List<JobSeekerAccount> getAll() {
        return userAccountRepository.findAll();
    }

    @Override
    public JobSeekerAccount readByEmail(String userEmail) {
        return userAccountRepository.readByEmail(userEmail);
    }
}
