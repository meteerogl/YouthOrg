package com.mete.YouthOrg.controller;


import com.mete.YouthOrg.model.Organization;
import com.mete.YouthOrg.model.User;
import com.mete.YouthOrg.service.OrganizationService;
import com.mete.YouthOrg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private OrganizationService organizationService;

    @RequestMapping(value="/admin/home", method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByUsername(auth.getName());
        modelAndView.addObject("user", user);
        modelAndView.setViewName("admin/home");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/organizations",method = RequestMethod.GET)
    public ModelAndView organizations(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("organizations",organizationService.findAll());
        modelAndView.setViewName("/admin/organizations");
        return modelAndView;

    }

    @RequestMapping(value = "/admin/addOrganization",method = RequestMethod.GET)
    public ModelAndView addOrganization(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/admin/addOrganization");
        return modelAndView;
    }



}
