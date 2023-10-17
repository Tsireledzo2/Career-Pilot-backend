package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.educationinfo;

@Repository
public interface educationRepository extends JpaRepository<educationinfo, Long> {
}
