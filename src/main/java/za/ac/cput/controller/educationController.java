package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.educationinfo;
import za.ac.cput.service.EducationService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/Education")
@CrossOrigin
public class educationController {
    @Autowired
    private EducationService educationService;

    @PostMapping("add")
    public String add(@RequestBody educationinfo edu) {
        educationService.saveEducation(edu);
        return "new education is added";
    }


    @GetMapping // Retrieve all education information
    public List<educationinfo> getAllEducationInfo() {
        return educationService.getAllEducationInfo();
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody educationinfo updatedEdu) {
        educationinfo existingEdu = educationService.getEducationById(id);
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


