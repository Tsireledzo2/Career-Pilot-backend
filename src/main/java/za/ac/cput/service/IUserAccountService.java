package za.ac.cput.service;

import za.ac.cput.domain.UserAccount;

import java.util.List;

public interface IUserAccountService extends IService<UserAccount, String>{
    public List<UserAccount> getAll();
    public UserAccount readByEmail(String userEmail);

}
