package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.CompanyProfile;
import za.ac.cput.service.impl.CompanyProfileServiceImpl;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/companyProfile")
public class CompanyProfileController {

    @Autowired
    private CompanyProfileServiceImpl companyProfileService;


    @PostMapping("/add")
    public String add(@RequestBody CompanyProfile companyProfile){
        companyProfileService.saveCompanyProfile(companyProfile);
        return "New Job Seeker Profile is added";

    }

    @GetMapping("/getAll")
    public List<CompanyProfile> getAllCompanyProfiles(){
        return companyProfileService.getAll();
    }
}
