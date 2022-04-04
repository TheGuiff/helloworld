package com.openclassrooms.helloworld.service;

import com.openclassrooms.helloworld.model.HelloWorld;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    public HelloWorld getHelleWorld() {
        HelloWorld helloWorld = new HelloWorld();
        return helloWorld;
    }

}
