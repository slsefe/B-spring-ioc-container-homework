package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class GreetingService {

    public GreetingService() {
        System.out.println("An GreetingService object is instantiated");
    }

    String sayHi() {
        return "hello world";
    }
}
