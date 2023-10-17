package za.ac.cput.service;

import za.ac.cput.domain.CompanyProfile;

import java.util.List;

public interface CompanyProfileService  {


    public CompanyProfile saveCompanyProfile(CompanyProfile companyProfileProfile);

    public List<CompanyProfile> getAll();
}
