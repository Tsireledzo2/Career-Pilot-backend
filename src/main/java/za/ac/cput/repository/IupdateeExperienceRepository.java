package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.updateExperience;

@Repository
public interface IupdateeExperienceRepository extends JpaRepository<updateExperience, Long> {
}
