package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.CompanyProfile;
@Repository
public interface CompanyProfileRepository extends JpaRepository<CompanyProfile, String> {
}
