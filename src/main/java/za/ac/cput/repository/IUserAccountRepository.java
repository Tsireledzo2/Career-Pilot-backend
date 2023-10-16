package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.UserAccount;

@Repository
public interface IUserAccountRepository extends JpaRepository<UserAccount, String> {

    @Query("SELECT u FROM UserAccount u WHERE u.email = :email")
    public UserAccount readByEmail(String email);
}
