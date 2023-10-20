package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Experience;
import za.ac.cput.repository.ExperienceRepository;
import za.ac.cput.service.ExperienceService;

import java.util.List;

@RestController
@RequestMapping("/Experience")
@CrossOrigin(origins = "http://localhost:5173")
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;
    @Autowired
    private ExperienceRepository experienceRepository;


    @PostMapping("/saveExperience")
    public Experience createExperience(@RequestBody Experience experience) {
        return experienceRepository.save(experience);
    }

    @GetMapping // Retrieve all education information
    public List<Experience> getAllExperienceInfo() {
        return experienceService.getAllupdateExperience();
    }


    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Experience updatedEdu) {
        Experience existingEdu = experienceService.getEperienceyId(id);
        if (existingEdu != null) {
            // Print values before updating
            System.out.println("Existing Start Date: " + existingEdu.getStartDate());
            System.out.println("Updated Start Date: " + updatedEdu.getStartDate());

            // Update fields directly
            existingEdu.setCompanyName(updatedEdu.getCompanyName());
            existingEdu.setRoleName(updatedEdu.getRoleName());
            existingEdu.setStartDate(updatedEdu.getStartDate());
            existingEdu.setEndDate(updatedEdu.getEndDate());
            experienceService.saveupdateExperience(existingEdu);

            // Print values after updating
            System.out.println("Updated Start Date (after): " + existingEdu.getStartDate());

            return "Education information updated";
        } else {
            return "Education not found";


        }


    }
}