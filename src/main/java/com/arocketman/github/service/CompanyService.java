package com.arocketman.github.service;

import com.arocketman.github.entities.Company;
import com.arocketman.github.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.scheduling.annotation.Async;


import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {


    @Autowired
    private CompanyRepository companyRepository;

    public Optional<Company> getCompany(Long id){
        return companyRepository.findById(id);
    }
   /* public Optional<Company> getCompanyByRegion(String region){
        return regionRepository.findByRegion(region);
    }*/
    /*public Optional<Company> getCompanyRegion(){
        return companyRepository.findRegion();
    }*/


    public List<Company> getAllCompanies() {
        return companyRepository.findAll();


    }
}
