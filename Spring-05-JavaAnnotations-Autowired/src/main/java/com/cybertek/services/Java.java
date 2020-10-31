package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Java implements Course {


    //Field Injections
    @Autowired
    private OfficeHours officeHours;
   // private ExtraSessions extraSessions;


    //Constructor Injection @AllArgsConstr
//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    //Getter and Setter Injections
//    public OfficeHours getOfficeHours() {
//        return officeHours;
//    }
//    @Autowired
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours :" + (30 + officeHours.getHours()));
    }
}
