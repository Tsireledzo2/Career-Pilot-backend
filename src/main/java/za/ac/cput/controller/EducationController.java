package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Education;
import za.ac.cput.repository.EducationRepository;
import za.ac.cput.service.EducationService;

import java.util.List;

@RestController
@RequestMapping("/Education")
@CrossOrigin(origins = "http://localhost:5173")

public class EducationController {
    @Autowired
    private EducationService educationService;
    @Autowired
  private EducationRepository educationRepository;


    @PostMapping("/save")
    public Education saveEducation(@RequestBody Education education) {
        return educationRepository.save(education);
    }

    @GetMapping // Retrieve all education information
    public List<Education> getAllEducationInfo() {
        return educationService.getAllEducationInfo();
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Education updatedEdu) {
        Education existingEdu = educationService.getEducationById(id);
        if (existingEdu != null) {
            // Print values before updating
            System.out.println("Existing Start Date: " + existingEdu.getStartDate());
            System.out.println("Updated Start Date: " + updatedEdu.getStartDate());

            // Update fields directly
            existingEdu.setInstitutionName(updatedEdu.getInstitutionName());
            existingEdu.setQualificationName(updatedEdu.getQualificationName());
            existingEdu.setStartDate(updatedEdu.getStartDate());
            existingEdu.setGraduationDate(updatedEdu.getGraduationDate());

            educationService.saveEducation(existingEdu);

            // Print values after updating
            System.out.println("Updated Start Date (after): " + existingEdu.getStartDate());

            return "Education information updated";
        } else {
            return "Education not found";
        }
    }


}


