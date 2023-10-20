package za.ac.cput.service;

import za.ac.cput.domain.Education;

import java.util.List;

public interface EducationService {
    public Education saveEducation(Education education);

    Education getEducationById(Long id); // Add this method to retrieve by ID

    List<Education> getAllEducationInfo(); // Add this method to retrieve all
}
