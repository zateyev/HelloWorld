package ru.tpu.helloworld.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletCxt) throws ServletException {

        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(AppConfig.class);
        ac.setServletContext(servletCxt);

        ServletRegistration.Dynamic servlet = servletCxt.addServlet("dispatcher", new DispatcherServlet(ac));

        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }

}
