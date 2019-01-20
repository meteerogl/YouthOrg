package com.mete.YouthOrg.configuration;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
* Admin can manage all works
* Organization Admin is responsible just her/his organization.He/She can add university representer
* University Representer is responsible just own university.He/She can add users
* Users is users
*/

@Component
public class UrlAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        //set our response to OK status
        httpServletResponse.setStatus(httpServletResponse.SC_OK);
        logger.info("at OnAuthenticationSuccess(..) function");

        for(GrantedAuthority auth: authentication.getAuthorities()){
            if("ADMIN".equals(auth.getAuthority())){
                httpServletResponse.sendRedirect("admin/home");
            }
            else if("ORGADMIN".equals(auth.getAuthority())){
                httpServletResponse.sendRedirect("orgAdmin/home");
            }
            else if("UNIREP".equals(auth.getAuthority())){
                httpServletResponse.sendRedirect("uniRep/home");
            }
            else if("USER".equals(auth.getAuthority())){
                httpServletResponse.sendRedirect("user/home");
            }
        }
    }
}
