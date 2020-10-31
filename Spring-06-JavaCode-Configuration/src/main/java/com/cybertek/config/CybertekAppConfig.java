package com.cybertek.config;

import com.cybertek.interfaces.ExtraSessions;
import com.cybertek.services.Java;
import com.cybertek.services.OfficeHours;
import com.cybertek.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cybertek")


public class CybertekAppConfig {

    @Bean
    public Java java(){
        return new Java(officeHours());
    }
    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

    @Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }

    //same as above
    @Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }

}
