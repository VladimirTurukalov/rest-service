package com.example.REST_API.APP.Controller;

import java.util.concurrent.atomic.AtomicLong;

import com.example.REST_API.APP.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String templateFirstName = "%s";
    private static final String templateLastName = "%s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/firstname/{firstname}/lastname/{lastname}")
    public Greeting greeting(
        @PathVariable("firstname") String firstname,
        @PathVariable("lastname") String lastname
    ) {
        return new Greeting(
            counter.incrementAndGet(),
            String.format(templateFirstName, firstname),
            String.format(templateLastName, lastname)
        );
    }
}
