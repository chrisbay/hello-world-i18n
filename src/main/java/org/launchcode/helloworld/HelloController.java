package org.launchcode.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Chris Bay
 */
@Controller("/")
public class HelloController {

    @GetMapping
    public String hello() {
        return "hello";
    }

}
