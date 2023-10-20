package za.ac.cput.service;

import za.ac.cput.domain.JobSeekerAccount;

import java.util.List;

public interface IUserAccountService extends IService<JobSeekerAccount, String>{
    public List<JobSeekerAccount> getAll();
    public JobSeekerAccount readByEmail(String userEmail);

}
