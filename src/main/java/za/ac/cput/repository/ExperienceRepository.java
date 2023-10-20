package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Experience;

@Repository
public interface ExperienceRepository extends JpaRepository<Experience, Long> {
}
