package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Experience;
import za.ac.cput.repository.ExperienceRepository;
import za.ac.cput.service.ExperienceService;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    @Autowired
    private ExperienceRepository experience;

    @Override
    public Experience saveupdateExperience(Experience Experience) {

        return experience.save(Experience);
    }

    @Override
    public Experience getEperienceyId(Long id) {
        Optional<Experience> updateExperienceOptional = experience.findById(id);
        return updateExperienceOptional.orElse(null);
    }

    @Override
    public List<Experience> getAllupdateExperience() {
        return experience.findAll();
    }
}
