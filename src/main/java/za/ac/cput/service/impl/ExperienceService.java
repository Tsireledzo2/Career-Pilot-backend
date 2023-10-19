package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.updateExperience;
import za.ac.cput.repository.IupdateeExperienceRepository;
import za.ac.cput.service.IupdateExperienceService;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceService implements IupdateExperienceService {

    @Autowired
    private IupdateeExperienceRepository  experience;

    @Override
    public updateExperience saveupdateExperience(updateExperience Experience) {

        return experience.save(Experience);
    }

    @Override
    public updateExperience getEperienceyId(Long id) {
        Optional<updateExperience> updateExperienceOptional = experience.findById(id);
        return updateExperienceOptional.orElse(null);
    }

    @Override
    public List<updateExperience> getAllupdateExperience() {
        return experience.findAll();
    }
}
