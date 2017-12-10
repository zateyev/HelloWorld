package ru.tpu.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.tpu.helloworld.util.GreetingUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class GreetingController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printGreeting(Model model) {

        // retrieve the greeting message from the database
        GreetingUtil greetingUtil = new GreetingUtil();
        String greetingMessage = greetingUtil.getGreetingById(1).getGreetingMessage();

        model.addAttribute("message", greetingMessage);

        return "welcome";
    }
}
