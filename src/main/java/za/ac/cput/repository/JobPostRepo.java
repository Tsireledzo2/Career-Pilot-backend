package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.JobPost;


import java.util.Optional;
@Repository
public interface JobPostRepo extends JpaRepository<JobPost, Long> {
    Optional<JobPost> findByCompanyID(String companyID);


}
