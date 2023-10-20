package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.CompanyProfile;
import za.ac.cput.repository.CompanyProfileRepository;
import za.ac.cput.service.CompanyProfileService;

import java.util.List;
@Service
public class CompanyProfileServiceImpl implements CompanyProfileService {

    @Autowired
    private CompanyProfileRepository companyProfileRepository;

    @Override
    public CompanyProfile create(CompanyProfile companyProfile) {
        return companyProfileRepository.save(companyProfile);
    }

    @Override
    public CompanyProfile read(String email) {
        return companyProfileRepository.findById(email).orElse(null);
    }

    @Override
    public CompanyProfile update(CompanyProfile companyProfile) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
}

