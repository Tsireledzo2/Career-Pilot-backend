package za.ac.cput.service;

import za.ac.cput.domain.educationinfo;
import za.ac.cput.domain.updateExperience;

import java.util.List;

public interface IupdateExperienceService {

    public updateExperience saveupdateExperience(updateExperience Experience);

    updateExperience getEperienceyId(Long id); // Add this method to retrieve by ID

    List<updateExperience> getAllupdateExperience(); // Add this method to retrieve all
}
