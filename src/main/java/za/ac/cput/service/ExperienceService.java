package za.ac.cput.service;

import za.ac.cput.domain.Experience;

import java.util.List;

public interface ExperienceService {

    public Experience saveupdateExperience(Experience Experience);

    Experience getEperienceyId(Long id); // Add this method to retrieve by ID

    List<Experience> getAllupdateExperience(); // Add this method to retrieve all
}
