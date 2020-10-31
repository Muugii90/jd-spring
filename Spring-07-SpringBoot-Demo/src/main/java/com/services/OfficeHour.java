package com.services;

import com.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHour implements ExtraSession {
    @Override
    public int getHour() {
        return 10;
    }


}
