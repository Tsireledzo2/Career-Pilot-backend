package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.educationinfo;
import za.ac.cput.domain.updateExperience;
import za.ac.cput.service.IupdateExperienceService;

import java.util.List;

@RestController
@RequestMapping("/Experience")
@CrossOrigin
public class updateExperinceController {

    @Autowired
    private IupdateExperienceService iupdateExperienceService;

    @PostMapping("add")
    public String add(@RequestBody updateExperience exp){
        iupdateExperienceService.saveupdateExperience(exp);
        return "new experience is added";
    }


    @GetMapping // Retrieve all education information
    public List<updateExperience> getAllEducationInfo() {
        return iupdateExperienceService.getAllupdateExperience();
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody updateExperience updatedEdu) {
        updateExperience existingEdu = iupdateExperienceService.getEperienceyId(id);
        if (existingEdu != null) {
            // Print values before updating
            System.out.println("Existing Start Date: " + existingEdu.getStartDate());
            System.out.println("Updated Start Date: " + updatedEdu.getStartDate());

            // Update fields directly
            existingEdu.setCompanyName(updatedEdu.getCompanyName());
            existingEdu.setRoleName(updatedEdu.getRoleName());
            existingEdu.setStartDate(updatedEdu.getStartDate());
            existingEdu.setEndDate(updatedEdu.getEndDate());

            iupdateExperienceService.saveupdateExperience(existingEdu);

            // Print values after updating
            System.out.println("Updated Start Date (after): " + existingEdu.getStartDate());

            return "Education information updated";
        } else {
            return "Education not found";
        }
    }


}



