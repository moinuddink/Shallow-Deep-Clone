package com.tshaped.service;

import org.springframework.stereotype.Component;

//@Component --> it is a message to the springframework it has to take care of the bean
@Component
public class Alpha {
    public Alpha() {
        System.out.println("Alpha Bean Created");
    }
}
