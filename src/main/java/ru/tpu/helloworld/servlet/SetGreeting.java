package ru.tpu.helloworld.servlet;

import ru.tpu.helloworld.entity.Greeting;
import ru.tpu.helloworld.util.GreetingUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetGreeting extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String newGreeting = request.getParameter("newGreeting").trim();
        if ("".equals(newGreeting)) {
            newGreeting = "Hello world!";
        }

        GreetingUtil greetingUtil = new GreetingUtil();
        greetingUtil.updateGreeting(new Greeting(1, newGreeting));

        response.setContentType("text/plain");
        response.getWriter().write(newGreeting);
    }
}
