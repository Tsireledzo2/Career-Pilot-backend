package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.JobSeekerAccount;

@Repository
public interface IUserAccountRepository extends JpaRepository<JobSeekerAccount, String> {

    @Query("SELECT u FROM JobSeekerAccount u WHERE u.email = :email")
    public JobSeekerAccount readByEmail(String email);
}
