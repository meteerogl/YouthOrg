package com.mete.YouthOrg.service;


import com.mete.YouthOrg.model.Organization;
import com.mete.YouthOrg.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;

    public List<Organization> findAll(){
        return organizationRepository.findAll();
    }


}
