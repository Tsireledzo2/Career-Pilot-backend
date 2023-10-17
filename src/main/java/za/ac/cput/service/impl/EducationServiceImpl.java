package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.educationinfo;
import za.ac.cput.repository.educationRepository;
import za.ac.cput.service.EducationService;

import java.util.List;
import java.util.Optional;

@Service
public class EducationServiceImpl implements EducationService {
    @Autowired
    private educationRepository Education;

    @Override
    public educationinfo saveEducation(educationinfo education) {

        return Education.save(education);
    }

    @Override
    public educationinfo getEducationById(Long id) {
        Optional<educationinfo> educationOptional = Education.findById(id);
        return educationOptional.orElse(null) ;
    }

    @Override
    public List<educationinfo> getAllEducationInfo() {
        return Education.findAll();
    }
}