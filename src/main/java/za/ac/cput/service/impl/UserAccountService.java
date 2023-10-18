package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.UserAccount;
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
    public UserAccount create(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }

    @Override
    public UserAccount read(String userAccount) {
        return userAccountRepository.findById(userAccount).orElse(null);
    }

    @Override
    public UserAccount update(UserAccount userAccount) {
        if(this.userAccountRepository.existsById(userAccount.getAccountID()))
            return this.userAccountRepository.save(userAccount);
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
    public List<UserAccount> getAll() {
        return userAccountRepository.findAll();
    }

    @Override
    public UserAccount readByEmail(String userEmail) {
        return userAccountRepository.readByEmail(userEmail);
    }
}
