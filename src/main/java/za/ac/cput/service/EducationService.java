package za.ac.cput.service;

import za.ac.cput.domain.educationinfo;

import java.util.List;

public interface EducationService {
    public educationinfo saveEducation(educationinfo education);

    educationinfo getEducationById(Long id); // Add this method to retrieve by ID

    List<educationinfo> getAllEducationInfo(); // Add this method to retrieve all
}
