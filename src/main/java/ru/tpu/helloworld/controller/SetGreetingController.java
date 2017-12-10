package ru.tpu.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.tpu.helloworld.model.Greeting;
import ru.tpu.helloworld.util.GreetingUtil;

@Controller
public class SetGreetingController {

    @RequestMapping(value = "/set-greeting", method = RequestMethod.GET)
    @ResponseBody
    public String setGreeting(@RequestParam("newGreeting") String newGreeting) {

        if ("".equals(newGreeting)) {
            newGreeting = "Hello world!";
        }

        // update the greeting message in the database
        GreetingUtil greetingUtil = new GreetingUtil();
        greetingUtil.updateGreeting(new Greeting(1, newGreeting));

        return newGreeting;
    }
}
