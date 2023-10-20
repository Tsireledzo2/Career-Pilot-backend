package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.repository.EducationRepository;
import za.ac.cput.service.EducationService;

import java.util.List;
import java.util.Optional;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    private EducationRepository Education;

    @Override
    public za.ac.cput.domain.Education saveEducation(za.ac.cput.domain.Education education) {

        return Education.save(education);
    }

    @Override
    public za.ac.cput.domain.Education getEducationById(Long id) {
        Optional<za.ac.cput.domain.Education> educationOptional = Education.findById(id);
        return educationOptional.orElse(null) ;
    }

    @Override
    public List<za.ac.cput.domain.Education> getAllEducationInfo() {
        return Education.findAll();
    }
}