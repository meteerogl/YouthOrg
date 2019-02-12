package com.mete.YouthOrg.controller;


import com.mete.YouthOrg.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrgAdminController {

    @Autowired
    OrganizationService organizationService;

    @RequestMapping(value = "orgAdmin/home",method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("organizations",organizationService.findAll());
        modelAndView.setViewName("orgAdmin/home");
        return modelAndView;


    }


}



